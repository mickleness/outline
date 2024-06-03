package com.pump.awt.geom.outline;

import java.util.Objects;

/**
 * This OutlineFactory creates an {@link CompoundOutline}
 */
public class CompoundOutlineFactory extends OutlineFactory<CompoundOutline> {
    // TODO: serialize this and everything else in this package

    private OutlineFactory delegateFactory;

    public CompoundOutlineFactory(OutlineFactory delegateFactory) {
        this.delegateFactory = Objects.requireNonNull(delegateFactory);
    }

    @Override
    public CompoundOutline create() {
        return new CompoundOutline(delegateFactory);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[ delegateFactory = " + delegateFactory + "]";
    }

    @Override
    public int hashCode() {
        return 6891295;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == getClass() &&
                ((CompoundOutlineFactory)obj).delegateFactory.equals(delegateFactory);
    }
}
