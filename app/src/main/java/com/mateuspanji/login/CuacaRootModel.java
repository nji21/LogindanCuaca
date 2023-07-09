package com.mateuspanji.login;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CuacaRootModel {
    @SerializedName("list")
    private List<CuacaListModel> listModelList;

    public CuacaRootModel(){ }

    List<CuacaListModel> getListModelList() {return listModelList; }

    public void setListModelList(List<CuacaListModel> listModelList) {
        this.listModelList = listModelList;
    }
}
