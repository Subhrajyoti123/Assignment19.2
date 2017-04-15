package com.example.somina.myapplication.network;

import com.example.somina.myapplication.utils.CommonUtilities;

public interface OnWebServiceResult {
    void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}