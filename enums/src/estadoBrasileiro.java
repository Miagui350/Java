
public enum estadoBrasileiro{
    ACRE("AC", "Acre"),
    ALAGOAS("AL","Alagoas"),
    AMAPA("AP","Amapá"),
    AMAZONAS("AM","Amazonas"),
    BAHIA("BA","Bahia"),
    CEARA("CE","Ceará"),
    DISTRITO_FEDERAL("DF","Distrito Federal"),
    ESPIRITO_SANTO("ES","Espírito Santo"),
    GOIAS("GO","Goiás"),
    MARANHAO("MA","Maranhão"),
    MATO_GROSSO("MT","Mato Grosso"),
    MATO_GROSSO_DO_SUL("MS","Mato Grosso do Sul"),
    MINAS_GERAIS("MG","Minas Gerais"),
    PARA("PA","Pará"),
    PARAIBA("PB","Paraibá"),
    PARANA("PR","Paraná"),
    PERNAMBUCO("PE","Pernambuco"),
    PIAUI("PI","Piauí"),
    RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
    RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul"),
            RIO_GRANDE_DO_NORTE("RN","Rio Grande do Norte"),
    RODONIA("RO","Rondônia"),
    SANTA_CATARINA("SC","Santa Catarina"),
    SAO_PAULO("SP","São Paulo"),
    SERGIPE("SE","Sergipe"),
    TOCANTINS("TO","Tocantins");

    private final String siglas;
    private String nome;
    private String Siglas;

    private estadoBrasileiro(String siglas, String nome){
        this.siglas = siglas;
        this.nome = nome;

    }
    public String getSiglas(){
        return siglas;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return  nome.toUpperCase();

    }


}