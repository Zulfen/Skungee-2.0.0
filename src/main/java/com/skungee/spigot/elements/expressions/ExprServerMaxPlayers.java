package com.skungee.spigot.elements.expressions;

import org.eclipse.jdt.annotation.Nullable;

import com.skungee.shared.objects.SkungeeServer;

import ch.njol.skript.expressions.base.SimplePropertyExpression;

public class ExprServerMaxPlayers extends SimplePropertyExpression<SkungeeServer, Number> {

	static {
		// Property name is to avoid confusion with 'player count of %skungeeservers%'
		register(ExprServerMaxPlayers.class, Number.class, "(max[imum] player count|[max[imum]] player limit)", "skungeeservers");
	}

	@Override
	public Class<? extends Number> getReturnType() {
		return Number.class;
	}

	@Override
	@Nullable
	public Number convert(SkungeeServer server) {
		return server.getMaxPlayerLimit();
	}

	@Override
	protected String getPropertyName() {
		return "max player limit";
	}

}
