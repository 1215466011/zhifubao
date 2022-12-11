package com.example.allpay.Controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePrecreateModel;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;

public class TSstss {
    public static void main(String[] args) {
        AlipayClient alipayClient = new DefaultAlipayClient(
                "https://openapi.alipay.com/gateway.do",
                "2016101700706620",
                "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDaLIXuMHRukWqSLvR66NSsaV/TLYmrJKtDjc30aX9IDEHbDESL2mO5gwkQATiQTMd2079n/T5GSpHbkas0SCRgQ/Ysvp4ftrJYBpvLKRd+NSFC0LIW1zJ+f64xHF9DW2JNDZxeghyaICIp6Hjvg8ReBqdobeEZaMiVfYe2FLYbGstG8ESVq53Ur266GfDV9gIb4y4wzgMuMjB38vhphjcmb2DSypM1LNOkwFZQZeUtDz+eiuzsD3H1XFZX8/tAPmcOI/ZvaY3GU8XJCkITmPGgb3Jj6IXfVDazOXCzrK0oI9SFmbHKa3ve2n44Td3ngPG4OlN0s2TegkkFPgOIHSIhAgMBAAECggEBAMj7nQF4p7m3whoaoWOcm1ac2Aa9e4YqiI750hHnIbboe75jxb2kGJwsByw0Q7xCzrk7hacxVq4AQe+oeLP4BXKdCOndS+NhNVf79ocoOpksLpDTmkuKQNzhmEFrpqJxS9Q5xqQVbm3ZTj+XBdl3ZG1N6eg82NHEgoucEWn+GGhMCbN9ZCEzQ5i8AmQTCjEHLOxR27u87u7aBUDbVUSymTx/Jli2Jlgur3qcUt8iSqlYBgJ5/EdFqTbsRJCHnTBYFdR91Mh8HibCZxurcEU7ooxwKs10UP9OPlKA0kb61eqcJRZOoig/+z7eVnA5hXF/ak4axIMMzJvrlzlbS3f9uJUCgYEA95ajAKCfo7PzlNae6By/ecRjmEwIWynjtrpUMZkRvwy4rbEvsdIto/y6HL6MqcHjLsMr2bSqgpe628vsVJHpSIgzI/oYOKtHdxcSKkvVtDeHJirRP8OreCLMRy9zYwL7cUVHoiwDghm+R9IKslmg9xCAh2f92Hifgj3tVCV7e/8CgYEA4ZYO5GUpvZoL36ex19heheshOuGk59SBej3YNxw0UEeB4P/OwqSgzo5q/mPbhdISro9tck3dKaAE6oJGw9d83OXVGiBn71A6RvGQGpfRYu+qYTj9F6Cd/y3UiIV6ewRb1iyiTXbRbPz6XotW/Iq2Vf5QAMhp2hgkqn3hHWpv4d8CgYA6LMv6LsOz7GmUlGVcNr0K+IlKVLs16H7YBaoYyVWxJWUTcum5B6Cvwodcj61vid4+s59PFTNnYg2G7cCHEo3U/CPAFVixoBU3t1UOWSlKoi2AW1k1eV2F6e9D3rNnFWFNeTDeuybL4A6kw4a95295/gelSVsNDTK1oKVuOyxrswKBgArqOtA8QNfGs1pf/8/kzTYHmXUC4/q/ooAqq+KGv9U+kH81gWiTlKBJ7c1fQYjpEDRYBkComdHgxzwdj5T8QTNi/3ujI8RFinxSRdmzjNMPq5vGqSBSijKFoin042c+X78uK7A51opCd07JySyw/X+NrYtMJysBTgzdyF2m/8DbAoGBAJPO0oDbLUiI6zpVg4nts0GhBUkXOFYfHEaZNumzUJ8MyHC4yUBjmho8Ny2gcYu8d/Ge/4MzrYBMrrjIDLCx/r8j6BqO9AFQcQFKT27iklHZNaeesJ7c49I15SoTvq1xjfS4ckxSOIaVTu4xYFMs4dIEmiCeDnsbgH4d8RrJVN22",
                "JSON",
                "UTF-8",
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkdxBaf5axAVAdKyf+6U/VBHUBghvUBq4rW3bfWM+Wy2EBp1zq1p4t4M4zkddRduKnZNJB8RPJauzsXIFxFCv6OQYdBf+NRInK2XzotBzQCsGlM/9wQeHg7oTp1jOV54jV6iw/1sC5LQ1x5DCR+XED3eampR+JR+we0r9tnDw/uvPXlL43X2QeJ4tisQgQj/R/tYiBNb1GiYoXmX9I0kiuwF4IPWG7kZfDZmVvGhpAsVAG7NuXT7WuddS7JadfFCSLWwVWjQqfNSVRBLcYlmHGyx/LIhrxmX6Z6pgoDLpNzuq/QfXXxs0fGYpQh97tAoRKir5WsOJZKwtscUp0XFRNwIDAQAB",
                "RSA2");
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
        AlipayTradePrecreateModel model = new AlipayTradePrecreateModel();
        request.setBizModel(model);
        model.setOutTradeNo("http:www.baidu.com");
        model.setTotalAmount("88.88");
        model.setSubject("Iphone6 16G");
        AlipayTradePrecreateResponse response = null;
        try {
            response = alipayClient.execute(request);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        System.out.print(response.getBody());
        System.out.print(response.getQrCode());
    }
}
