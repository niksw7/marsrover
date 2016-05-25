package model;

/**
 * Created by nikeshs on 24/05/16.
 */
public enum Head {
    N,
    E,
    S,
    W;

    Head previous() {
        if(this.equals(N)){
            return W;
        }
        return values()[(ordinal() - 1)];
    }
    Head next() {
        return values()[(ordinal() + 1) % values().length];
    }
}
