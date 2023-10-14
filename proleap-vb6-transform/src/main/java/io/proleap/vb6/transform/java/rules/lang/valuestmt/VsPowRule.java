package io.proleap.vb6.transform.java.rules.lang.valuestmt;

import jakarta.inject.Singleton;

import io.proleap.vb6.VisualBasic6Parser.VsPowContext;
import io.proleap.vb6.asg.metamodel.Operator.VbOperator;
import io.proleap.vb6.asg.metamodel.valuestmt.ValueStmt;
import io.proleap.vb6.transform.rule.RuleContext;

@Singleton
public class VsPowRule extends VsOperatorRule<VsPowContext, ValueStmt> {

	@Override
	public void apply(final VsPowContext ctx, final ValueStmt valueStmt, final RuleContext rc) {
		printOperator(rc, VbOperator.POW, ctx.valueStmt());
	}

	@Override
	public Class<VsPowContext> from() {
		return VsPowContext.class;
	}
}
