package net.joshdevins.elasticsearch.scorer;

import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.script.ScriptModule;

public final class Plugin extends AbstractPlugin {

    @Override
    public String name() {
        return getClass().getName();
    }

    @Override
    public String description() {
        return "Simple plugin to load our simple custom scorers.";
    }

    public void onModule(final ScriptModule module) {
        module.registerScript("constant-score", ConstantScoreFactory.class);
        module.registerScript("lucene-score", LuceneScoreFactory.class);
        module.registerScript("lucene-downscaled-score", LuceneDownscaledScoreFactory.class);
        module.registerScript("extra-lucene-score", ExtraLuceneScoreFactory.class);
    }
}
