package com.Model;

public class MypageStateModel {
    private String mypageStateText="default";
    private String mypageResultText="default";

    public MypageStateModel(String mypageStateText, String mypageResultText) {
        this.mypageStateText = mypageStateText;
        this.mypageResultText = mypageResultText;
    }

    public String getMypageStateText() {
        return mypageStateText;
    }

    public String getMypageResultText() {
        return mypageResultText;
    }
}
