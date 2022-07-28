public enum OpportunityCode implements Code{


    PRODUCT_NDXPRO("PN","라이선스 (NDX Pro)","라이선스","NDX PRO",3 ),
    PRODUCT_NFLOW("PF","라이선스 (NFLOW)","라이선스","NFLOW", 1),
    SERVICE_NDXPRO("SN","용역 (NDX Pro)","용역","NDX PRO",4),
    SERVICE_NFLOW("SF","용역 (NFLOW)","용역","NFLOW",2),
    R_AND_D("RD","R&D/지원사업","R&D","R&D",5),
    NDXPRO("N","NDXPRO","type","detailLabel",0),
    NFLOW("F","NFLOW","type","detailLabel",0),
    RD("D","R&D","type","detailLabel",0);

    private String code;

    private String label;

    private String type;

    private String detailLabel;

    private Integer orderNum;


    OpportunityCode(String code, String label, String type, String detailLabel, Integer orderNum) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.detailLabel = detailLabel;
        this.orderNum = orderNum;
    }
    ;


    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }




}
