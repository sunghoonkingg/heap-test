package kr.Ndxpro;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.ArrayList;
import java.util.UUID;

public class Test {

    ObjectMapper objectMapper;
    public static void main(String[] args) throws JsonProcessingException {





        ArrayList<String> heap;



        ProductNdxpro productNdxpro = new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3);

        ProductNdxpro productNflow = new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1);

        ProductNdxpro serivceNdxpro = new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4);

        ProductNdxpro serviceNflow = new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2);

        ProductNdxpro rANd = new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5);

        ProductNdxpro ndxpro = new ProductNdxpro("N", "NDXPRO", "type", "detailLabel", 0);

        ProductNdxpro nflow = new ProductNdxpro("F", "NFLOW", "type", "detailLabel", 0);

        ProductNdxpro rd = new ProductNdxpro("D", "R&D", "type", "detailLabel", 0);


    }

    }
