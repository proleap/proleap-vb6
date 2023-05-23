package io.proleap.vb6.transform.java.rules.lang;

import javax.inject.Singleton;

import io.proleap.vb6.VisualBasic6Parser.BlockStmtContext;
import io.proleap.vb6.asg.metamodel.ASGElement;
import io.proleap.vb6.transform.rule.RuleContext;
import io.proleap.vb6.transform.rule.VbTransformRule;

@Singleton
public class BlockStmtRule extends VbTransformRule<BlockStmtContext, ASGElement> {

	@Override
	public void apply(final BlockStmtContext ctx, final ASGElement asgElement, final RuleContext rc) {
		rc.visitChildren(ctx);
	}

	@Override
	public Class<BlockStmtContext> from() {
		return BlockStmtContext.class;
	}
}
