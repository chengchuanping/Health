package com.is.ui.adapter;

import java.util.ArrayList;
public class ListViewDataAdapter<ItemDataType> extends ListViewDataAdapterBase<ItemDataType> {

    protected ArrayList<ItemDataType> mItemDataList = new ArrayList<ItemDataType>();

    public ListViewDataAdapter() {

    }

    /**
     * @param viewHolderCreator The view holder creator will create a View Holder that extends {@link ViewHolderBase}
     */
    public ListViewDataAdapter(ViewHolderCreator<ItemDataType> viewHolderCreator) {
        super(viewHolderCreator);
    }

    public ArrayList<ItemDataType> getDataList() {
        return mItemDataList;
    }

    @Override
    public int getCount() {
        return mItemDataList.size();
    }

    @Override
    public ItemDataType getItem(int position) {
        if (mItemDataList.size() <= position || position < 0) {
            return null;
        }
        return mItemDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
