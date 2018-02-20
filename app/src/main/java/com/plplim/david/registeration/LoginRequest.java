package com.plplim.david.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by OHRok on 2018-02-20.
 */

public class LoginRequest extends StringRequest {

    final static private String URL = "http://plplim.ipdisk.co.kr:8000/registration/UserLogin.php";
    private Map<String, String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);

    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
