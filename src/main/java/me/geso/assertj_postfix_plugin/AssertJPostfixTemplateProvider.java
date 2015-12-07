package me.geso.assertj_postfix_plugin;

import java.util.HashSet;
import java.util.Set;

import org.jetbrains.annotations.NotNull;

import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;

public class AssertJPostfixTemplateProvider extends JavaPostfixTemplateProvider {
    private final HashSet<PostfixTemplate> templates;

    public AssertJPostfixTemplateProvider() {
        templates = new HashSet<>();
        templates.add(new AssertJTemplate());
    }

    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }
}
