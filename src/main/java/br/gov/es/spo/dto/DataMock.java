package br.gov.es.spo.dto;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class DataMock {
    
    private static final Logger LOGGER = Logger.getLogger(DataMock.class.getSimpleName()); 

    public static boolean populado = false;

    public static List<Custo> noCustos;
    public static List<Objeto> noObjetos;
    public static List<Investimento> noInvestimentos;
    public static List<ExecucaoOrcamentaria> noExecucaoOrcamentarias;
    public static List<PlanoOrcamentario> noPlanoOrcamentarios;
    public static List<UnidadeOrcamentaria> noUnidadeOrcamentarias;
    public static List<FonteOrcamentaria> noFonteOrcamentarias;

    public static void popularMock(){

        Investimento invAquisicaoDeFrotas = new Investimento("Aquisição de Frotas");
        Investimento invEsDigital = new Investimento("ES DIGITAL");
        Investimento invMacrodrenagem = new Investimento("EXECUÇÃO DAS OBRAS DE MACRODRENAGEM DA BACIA DO CÓRREGO RIBEIRA.");
        Investimento invCaisArtes = new Investimento("Cais das Artes");
        noInvestimentos.addAll(Arrays.asList(
            invAquisicaoDeFrotas, invEsDigital, invMacrodrenagem, invCaisArtes
        ) );

        ExecucaoOrcamentaria execucaoAquisicao2025F1 = new ExecucaoOrcamentaria("2025", 4377049d, 0, null, invAquisicaoDeFrotas);
        ExecucaoOrcamentaria execucaoAquisicao2025F2 = new ExecucaoOrcamentaria("2025", 4377049d, 0, null, invAquisicaoDeFrotas);
        ExecucaoOrcamentaria execucaoCais2025F1 = new ExecucaoOrcamentaria("2025", 216000000d, 0, null, invCaisArtes);
        noExecucaoOrcamentarias.addAll(Arrays.asList(
                execucaoAquisicao2025F1, execucaoAquisicao2025F2, execucaoCais2025F1
            ));

        PlanoOrcamentario planoAquisicaoFrota = new PlanoOrcamentario(831l, "AQUISIÇÃO DE FROTAS",
        Arrays.asList(
            execucaoAquisicao2025F1, execucaoAquisicao2025F2
        ));

        PlanoOrcamentario planoEsDigital = new PlanoOrcamentario(1022l, "ES DIGITAL", Arrays.asList());

        PlanoOrcamentario planoDrenagem = new PlanoOrcamentario(1083l, "EXECUÇÃO DAS OBRAS DE MACRODRENAGEM DA BACIA DO CÓRREGO RIBEIRA.",  Arrays.asList());

        PlanoOrcamentario planoCaisArtes = new PlanoOrcamentario(1242l, "Cais das Artes", Arrays.asList(execucaoCais2025F1));

        noPlanoOrcamentarios.addAll(Arrays.asList(
            planoAquisicaoFrota, planoEsDigital, planoDrenagem, planoCaisArtes
        ));


        UnidadeOrcamentaria uniPCES = new UnidadeOrcamentaria(45102l, "PCES",
            Arrays.asList(
                planoAquisicaoFrota
            ), 
            Arrays.asList());

        UnidadeOrcamentaria uniPMES = new UnidadeOrcamentaria(45103l, "PMES", 
            Arrays.asList(
                planoAquisicaoFrota
            ),
            Arrays.asList(
                execucaoAquisicao2025F1
            ));
        UnidadeOrcamentaria uniPCIES = new UnidadeOrcamentaria(45107l, "PCIES", 
            Arrays.asList(
                planoAquisicaoFrota
            ),
            Arrays.asList());
        UnidadeOrcamentaria uniFUNREBOM = new UnidadeOrcamentaria(45904l, "FUNREBOM", 
            Arrays.asList(
                planoAquisicaoFrota
            ),
            Arrays.asList(execucaoAquisicao2025F2));
        UnidadeOrcamentaria uniSEDH = new UnidadeOrcamentaria(48101l, "SEDH", 
            Arrays.asList(
                planoAquisicaoFrota
            ), 
            Arrays.asList());
        UnidadeOrcamentaria uniPRODEST = new UnidadeOrcamentaria(28203l, "PRODEST", 
            Arrays.asList( planoEsDigital ), 
            Arrays.asList()
        );
        UnidadeOrcamentaria uniSEDU = new UnidadeOrcamentaria(42101l, "SEDU", 
            Arrays.asList( planoEsDigital ), 
            Arrays.asList()
        );
        UnidadeOrcamentaria uniSEDURB = new UnidadeOrcamentaria(36101l, "SEDURB", 
            Arrays.asList( planoDrenagem ), 
            Arrays.asList()
        );

        UnidadeOrcamentaria uniSECULT = new UnidadeOrcamentaria(40101l, "SECULT",
            Arrays.asList( planoCaisArtes ), 
            Arrays.asList( execucaoCais2025F1 ));


        noUnidadeOrcamentarias.addAll(Arrays.asList(
            uniPCES, uniPMES, uniPCIES, uniFUNREBOM, uniSEDH, uniPRODEST, uniSEDU,
            uniSEDURB, uniSECULT
        ));        

        Objeto objAquiFrot1 = new Objeto("AQUISIÇÃO DE FROTAS", "Entrega", invAquisicaoDeFrotas);
        Objeto objAquiFrot2 = new Objeto("Aquisição de frota", "Entrega", invAquisicaoDeFrotas);
        Objeto objAquiFrot3 = new Objeto("AQUISIÇÃO DE FROTAS", "Entrega", invAquisicaoDeFrotas);
        Objeto objAquiFrot4 = new Objeto("AQUISIÇÃO DE FROTA", "Entrega", invAquisicaoDeFrotas);
        Objeto objAquiFrot5 = new Objeto("AQUISIÇÃO DE VEÍCULOS SUV - IASES", "Entrega", invAquisicaoDeFrotas);

        Objeto objDigital1 = new Objeto("ES DIGITAL", "Projeto", invEsDigital);
        Objeto objDigital2 = new Objeto("ES DIGITAL", "Projeto", invEsDigital);

        Objeto objDrenagem = new Objeto("EXECUÇÃO DAS OBRAS DE MACRODRENAGEM DA BACIA DO CÓRREGO RIBEIRA.", "Entrega", invMacrodrenagem);

        Objeto objCaisArtes = new Objeto("Cais das Artes", "Projeto", invCaisArtes);

        noObjetos.addAll(Arrays.asList(
            objAquiFrot1, objAquiFrot2, objAquiFrot3, objAquiFrot4, objAquiFrot5,
            objDigital1, objDigital2, objDrenagem, objCaisArtes
        ));
        
        Custo custoObj12025 = new Custo("2025", 26000000d, 26000000, objAquiFrot1);
        Custo custoObj22025 = new Custo("2025", 82250000d, 0, objAquiFrot2);
        Custo custoObj32025 = new Custo("2025", 6000000d, 0, objAquiFrot3);
        Custo custoObj42025 = new Custo("2024", 19023774.48d, 0, objAquiFrot4);
        
        Custo custoObj12026 = new Custo("2026",  26000000.00d, 0, objAquiFrot1);
        Custo custoObj22026 = new Custo("2026", 82250000d, 0, objAquiFrot2);
        Custo custoObj32026 = new Custo("2026", 6000000d, 0, objAquiFrot3);
        Custo custoObj42026 = new Custo("2026", 19023774.48d, 0, objAquiFrot4);
        
        Custo custoObj12027 = new Custo("2027",  26000000.00d, 0, objAquiFrot1);
        Custo custoObj22027 = new Custo("2027", 72000000d, 0, objAquiFrot2);
        Custo custoObj32027 = new Custo("2027", 6000000d, 0, objAquiFrot3);
        Custo custoObj42027 = new Custo("2027", 13587775.48d, 0, objAquiFrot4);

        Custo custoObjDrenagem2025 = new Custo("2025", 109915909.28d, 0, objDrenagem);

        Custo custoObjCais2025 = new Custo("2025", 74633732.98, 0, objCaisArtes);

        noCustos.addAll(Arrays.asList(
            custoObj12025, custoObj22025, custoObj32025, custoObj42025,
            custoObj12026, custoObj22026, custoObj32026, custoObj42026,
            custoObj12027, custoObj22027, custoObj32027, custoObj42027,
            custoObjDrenagem2025, custoObjCais2025
        ));

        FonteOrcamentaria fonte1 = new FonteOrcamentaria("Fonte 1",
            Arrays.asList(
                custoObj12025, custoObj22025, custoObj32025, custoObj42025,
                custoObj12026, custoObj22026, custoObj32026, custoObj42026,
                custoObj12027, custoObj22027, custoObj32027, custoObj42027,
                custoObjDrenagem2025, custoObjCais2025
            ),
            Arrays.asList(
                execucaoAquisicao2025F1, execucaoCais2025F1
            )
        );
        FonteOrcamentaria fonte2 = new FonteOrcamentaria("Fonte 2",
            Arrays.asList(),
            Arrays.asList(execucaoAquisicao2025F2));
        
        noFonteOrcamentarias.addAll(Arrays.asList(fonte1, fonte2));

        populado = true;

    }


}
