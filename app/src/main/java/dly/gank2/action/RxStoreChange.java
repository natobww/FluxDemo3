package dly.gank2.action;


/**
 * Pos a new event to notify that the store has changed
 */
public class RxStoreChange {

  String storeId;
  RxAction rxAction;

  public RxStoreChange(String storeId, RxAction rxAction) {
    this.storeId = storeId;
    this.rxAction = rxAction;
  }

  public RxAction getRxAction() {
    return rxAction;
  }

  public String getStoreId() {
    return storeId;
  }
}
