package net.leomixer17.askaddon.effects;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.eclipse.jdt.annotation.Nullable;

public class EffUnloadWorld extends Effect {

    private Expression<String> world;

    @SuppressWarnings("unchecked")
    @Override
    public boolean init(Expression<?>[] exprs, int arg1, Kleenean arg2, ParseResult arg3)
    {
        this.world = (Expression<String>) exprs[0];
        return true;
    }

    @Override
    public String toString(@Nullable Event arg0, boolean arg1)
    {
        return null;
    }

    @Override
    protected void execute(Event e)
    {
        Bukkit.getServer().unloadWorld(world.getSingle(e), true);
    }

}
