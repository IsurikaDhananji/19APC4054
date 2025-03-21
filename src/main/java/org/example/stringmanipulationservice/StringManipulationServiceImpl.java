package org.example.stringmanipulationservice;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class StringManipulationServiceImpl implements StringManipulationService {

    @Override
    public String reverseText(@WebParam(name = "text") String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharacters(@WebParam(name = "text") String text) {
        return text.length();
    }
}