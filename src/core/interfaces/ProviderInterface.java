package core.interfaces;

import core.services.StoreService;
import estorePojo.exceptions.UnknownItemException;

public interface ProviderInterface {
    double getPrice(Object item) throws UnknownItemException;

    int order(StoreService store, Object item, int qty) throws UnknownItemException;
}
