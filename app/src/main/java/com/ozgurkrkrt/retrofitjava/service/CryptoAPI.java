package com.ozgurkrkrt.retrofitjava.service;

import com.ozgurkrkrt.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE
    //URL BASE -> www.website.com
    //GET -> price?key=xxx
    //https://api.nomics.com/v1/prices?key=0bb282f8d52f15033cfaaf70ecfe3e0ef1b9fd77

    @GET("prices?key=0bb282f8d52f15033cfaaf70ecfe3e0ef1b9fd77")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();

}
