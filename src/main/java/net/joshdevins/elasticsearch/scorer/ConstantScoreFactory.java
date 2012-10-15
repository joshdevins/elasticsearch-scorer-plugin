package net.joshdevins.elasticsearch.scorer;

import java.util.Map;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.AbstractDoubleSearchScript;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

/**
 * A scorer that returns just a constant score of <code>1</code>. 
 */
public final class ConstantScoreFactory implements NativeScriptFactory {

    @Override
    public ExecutableScript newScript(@Nullable Map<String, Object> params) {
        return new AbstractDoubleSearchScript() {

            @Override
            public double runAsDouble() {
                return 1d;
            }
        };
    }

}
