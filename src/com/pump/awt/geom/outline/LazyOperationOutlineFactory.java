package com.pump.awt.geom.outline;

import java.util.Objects;

public class LazyOperationOutlineFactory extends OutlineFactory<LazyOperationOutline> {
    OutlineFactory delegateFactory;

    public LazyOperationOutlineFactory(OutlineFactory<?> delegateFactory) {
        this.delegateFactory = Objects.requireNonNull(delegateFactory);
    }

    @Override
    public LazyOperationOutline create() {
        return new LazyOperationOutline(delegateFactory);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[ delegateFactory = " + delegateFactory + "]";
    }

    @Override
    public int hashCode() {
        return -93282373;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == getClass() &&
                ((LazyOperationOutlineFactory)obj).delegateFactory.equals(delegateFactory);
    }
}
