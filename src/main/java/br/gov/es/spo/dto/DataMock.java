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
        Investimento invSinalizacoes = new Investimento("SINALIZAÇÕES DAS RODOVIAS ESTADUAIS - DER-ES");
        Investimento invObras = new Investimento("Obras e Supervisão do Caminhos do Campo");
        Investimento invCentroExce = new Investimento("CONSTRUÇÃO DO CENTRO DE EXCELÊNCIA DE ESPORTES");
        Investimento invModeResso = new Investimento("MODERNIZAÇÃO DO PROCESSO DE RESSOCIALIZAÇÃO");
        Investimento invGestaoBens = new Investimento("GESTÃO DE BENS PATRIMONIAIS");
        Investimento invIEMA = new Investimento("IEMA Digital");
        Investimento invGestaoEspaco = new Investimento("GESTÃO ESPAÇOS CULTURAIS E SEDE SECULT");
        Investimento invProjetosEspaciais = new Investimento("PROJETOS ESPECIAIS DO CONTRATO DE GESTÃO");
        Investimento invConstrCampo = new Investimento("CONSTRUÇÃO DE CAMPO BOM DE BOLA");
        Investimento invNovoFundo = new Investimento("NOVO FUNDO CIDADES");
        Investimento invCentroEvento = new Investimento("CENTRO DE EVENTOS DO MORANGÃO");
        Investimento invProjResso = new Investimento("PROJETOS DE RESSOCIALIZAÇÃO");
        Investimento invArcoViario = new Investimento("ARCO VIÁRIO DE COLATINA COM 4º PONTE");
        Investimento invCarroTransp = new Investimento("CARRO DE TRANSPORTE DE AERONAVES");

        noInvestimentos.addAll(Arrays.asList(
            invAquisicaoDeFrotas, invEsDigital, invMacrodrenagem, invCaisArtes,
            invSinalizacoes, invObras, invCentroExce, invModeResso, invGestaoBens,
            invIEMA, invGestaoEspaco, invProjetosEspaciais, invConstrCampo,
            invNovoFundo, invCentroEvento, invProjResso, invArcoViario,
            invCarroTransp
        ) );

        ExecucaoOrcamentaria execucaoAquisicao2025F1 = new ExecucaoOrcamentaria("2025", 4377049d, 0, null, invAquisicaoDeFrotas);
        ExecucaoOrcamentaria execucaoAquisicao2025F2 = new ExecucaoOrcamentaria("2025", 4377049d, 0, null, invAquisicaoDeFrotas);

        ExecucaoOrcamentaria execucaoCais2025F1 = new ExecucaoOrcamentaria("2025", 216000000d, 0, null, invCaisArtes);

        ExecucaoOrcamentaria execucaoSinalizacao2025F2 = new ExecucaoOrcamentaria("2025", 34800000d, 0, null, invSinalizacoes);

        ExecucaoOrcamentaria execucaoObras2025F1 = new ExecucaoOrcamentaria("2025", 372481632d, 0, null, invObras);

        ExecucaoOrcamentaria execucaoModeResso2025F1 = new ExecucaoOrcamentaria("2025", 2111050, 0, null, invModeResso);

        ExecucaoOrcamentaria execucaoGestaoBens12025F1 = new ExecucaoOrcamentaria("2025", 14663926, 0, null, invGestaoBens);
        ExecucaoOrcamentaria execucaoGestaoBens22025F1 = new ExecucaoOrcamentaria("2025", 645671, 0, null, invGestaoBens);

        ExecucaoOrcamentaria execucaoGestaoEspaco12025F1 = new ExecucaoOrcamentaria("2025", 3900000, 0, null, invGestaoEspaco);

        ExecucaoOrcamentaria execucaoConstrCampo2025F1 = new ExecucaoOrcamentaria("2025", 50000, 0, null, invConstrCampo);

        ExecucaoOrcamentaria execucaoNovoFundo2025F1 = new ExecucaoOrcamentaria("2025", 24750000, 0, null, invNovoFundo);

        ExecucaoOrcamentaria execucaoCentroEvento2025F1 = new ExecucaoOrcamentaria("2025", 708000, 0, null, invCentroEvento);

        ExecucaoOrcamentaria execucaoProjResso2025F2 = new ExecucaoOrcamentaria("2025", 390000, 0, null, invProjResso);

        ExecucaoOrcamentaria execucaoArcoViario2025F1 = new ExecucaoOrcamentaria("2025", 250000, 0, null, invArcoViario);

        noExecucaoOrcamentarias.addAll(Arrays.asList(
                execucaoAquisicao2025F1, execucaoAquisicao2025F2, execucaoCais2025F1,
                execucaoSinalizacao2025F2, execucaoObras2025F1, execucaoModeResso2025F1,
                execucaoGestaoBens12025F1, execucaoGestaoBens22025F1, execucaoGestaoEspaco12025F1,
                execucaoConstrCampo2025F1, execucaoNovoFundo2025F1, execucaoCentroEvento2025F1,
                execucaoProjResso2025F2, execucaoArcoViario2025F1
            ));

        PlanoOrcamentario planoAquisicaoFrota = new PlanoOrcamentario(831l, "AQUISIÇÃO DE FROTAS",
        Arrays.asList(
            execucaoAquisicao2025F1, execucaoAquisicao2025F2
        ));

        PlanoOrcamentario planoEsDigital = new PlanoOrcamentario(1022l, "ES DIGITAL", Arrays.asList());

        PlanoOrcamentario planoDrenagem = new PlanoOrcamentario(1083l, "EXECUÇÃO DAS OBRAS DE MACRODRENAGEM DA BACIA DO CÓRREGO RIBEIRA.",  Arrays.asList());

        PlanoOrcamentario planoCaisArtes = new PlanoOrcamentario(1242l, "Cais das Artes", Arrays.asList(execucaoCais2025F1));

        PlanoOrcamentario planoSinalizacao = new PlanoOrcamentario(1213l, "SINALIZAÇÕES DAS RODOVIAS ESTADUAIS - DER-ES",
            Arrays.asList(execucaoSinalizacao2025F2));

        PlanoOrcamentario planoObras = new PlanoOrcamentario(1870l, "Obras e Supervisão do Caminhos do Campo",
            Arrays.asList(execucaoObras2025F1));

        PlanoOrcamentario planoCentroExce = new PlanoOrcamentario(2118l, "CONSTRUÇÃO DO CENTRO DE EXCELÊNCIA DE ESPORTES", Arrays.asList());

        PlanoOrcamentario planoModeResso = new PlanoOrcamentario(2120l, "MODERNIZAÇÃO DO PROCESSO DE RESSOCIALIZAÇÃO",
            Arrays.asList(execucaoModeResso2025F1)
        );

        PlanoOrcamentario planoGestaoBens = new PlanoOrcamentario(2131l, "GESTÃO DE BENS PATRIMONIAIS", 
            Arrays.asList( execucaoGestaoBens12025F1, execucaoGestaoBens22025F1 )
        );

        PlanoOrcamentario planoIEMA = new PlanoOrcamentario(2156l, "IEMA Digital", Arrays.asList());

        PlanoOrcamentario planoGestaoEspaco = new PlanoOrcamentario(2184l, "GESTÃO ESPAÇOS CULTURAIS E SEDE SECULT",
            Arrays.asList(execucaoGestaoEspaco12025F1)
        );

        PlanoOrcamentario planoProjEspaciais = new PlanoOrcamentario(2278l, "PROJETOS ESPECIAIS DO CONTRATO DE GESTÃO",
            Arrays.asList()
        );

        PlanoOrcamentario planoConstrCampo = new PlanoOrcamentario(2321l, "CONSTRUÇÃO DE CAMPO BOM DE BOLA",
            Arrays.asList(execucaoConstrCampo2025F1)
        );

        PlanoOrcamentario planoNovoFundo = new PlanoOrcamentario(2344l, "NOVO FUNDO CIDADES", 
            Arrays.asList(execucaoNovoFundo2025F1)
        );

        PlanoOrcamentario planoCentroEventos = new PlanoOrcamentario(2355l, "CENTRO DE EVENTOS DO MORANGÃO", 
            Arrays.asList(execucaoCentroEvento2025F1)
        );

        PlanoOrcamentario planoProjResso = new PlanoOrcamentario(2381l, "PROJETOS DE RESSOCIALIZAÇÃO",
            Arrays.asList(execucaoProjResso2025F2)
        );

        PlanoOrcamentario planoArcoViario = new PlanoOrcamentario(2414l, "ARCO VIÁRIO DE COLATINA COM 4º PONTE",
            Arrays.asList(execucaoArcoViario2025F1)
        );

        PlanoOrcamentario planoCarroTransp = new PlanoOrcamentario(2423l, "CARRO DE TRANSPORTE DE AERONAVES", 
            Arrays.asList()
        );

        noPlanoOrcamentarios.addAll(Arrays.asList(
            planoAquisicaoFrota, planoEsDigital, planoDrenagem, planoCaisArtes,
            planoSinalizacao, planoObras, planoCentroExce, planoModeResso,
            planoGestaoBens, planoIEMA, planoGestaoEspaco, planoProjEspaciais,
            planoConstrCampo, planoNovoFundo, planoCentroEventos, planoProjResso,
            planoArcoViario, planoCarroTransp
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
                planoAquisicaoFrota, planoModeResso
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
            Arrays.asList( planoCaisArtes, planoGestaoEspaco ), 
            Arrays.asList( execucaoCais2025F1, execucaoGestaoEspaco12025F1 ));

        UnidadeOrcamentaria uniDERES = new UnidadeOrcamentaria(35201l, "DER-ES", 
            Arrays.asList(planoSinalizacao, planoArcoViario), 
            Arrays.asList(execucaoSinalizacao2025F2, execucaoArcoViario2025F1));

        UnidadeOrcamentaria uniSEAG = new UnidadeOrcamentaria(31101l, "SEAG",
            Arrays.asList(planoObras, planoCentroEventos),
            Arrays.asList(execucaoObras2025F1,  execucaoCentroEvento2025F1));

        UnidadeOrcamentaria uniFEAC = new UnidadeOrcamentaria(31901l, "FEAC",
            Arrays.asList(planoObras),
            Arrays.asList());

        UnidadeOrcamentaria uniSESPORT = new UnidadeOrcamentaria(39101l, "SESPORT",
            Arrays.asList(planoCentroExce, planoConstrCampo),
            Arrays.asList(execucaoConstrCampo2025F1));

        UnidadeOrcamentaria uniPROESPORTE = new UnidadeOrcamentaria(39901l, "PRÓ-ESPORTE",
            Arrays.asList(planoCentroExce),
            Arrays.asList());

        UnidadeOrcamentaria uniSEJUS = new UnidadeOrcamentaria(46101l, "SEJUS",
            Arrays.asList(planoGestaoBens, planoProjEspaciais, planoProjResso),
            Arrays.asList(execucaoGestaoBens12025F1));
        
        UnidadeOrcamentaria uniPPES = new UnidadeOrcamentaria(46113l, "PPES",
            Arrays.asList(planoGestaoBens),
            Arrays.asList(execucaoGestaoBens22025F1));
        
        UnidadeOrcamentaria uniIEMA = new UnidadeOrcamentaria(41201l, "IEMA",
            Arrays.asList(planoIEMA),
            Arrays.asList());

        UnidadeOrcamentaria uniFUNDEMA = new UnidadeOrcamentaria(41901l, "FUNDEMA",
            Arrays.asList(planoIEMA),
            Arrays.asList());

        UnidadeOrcamentaria uniFEADM = new UnidadeOrcamentaria(10906l, "FEADM", 
            Arrays.asList(planoNovoFundo), 
            Arrays.asList(execucaoNovoFundo2025F1));

        UnidadeOrcamentaria uniFTP = new UnidadeOrcamentaria(46901l, "FTP",
            Arrays.asList(planoProjResso),
            Arrays.asList());

        UnidadeOrcamentaria uniFUNPEN = new UnidadeOrcamentaria(46903l, "FUNPEN",
            Arrays.asList(planoProjResso),
            Arrays.asList(execucaoProjResso2025F2));

        UnidadeOrcamentaria uniSCM = new UnidadeOrcamentaria(10102l, "SCM",
            Arrays.asList(planoCarroTransp),
            Arrays.asList());

        noUnidadeOrcamentarias.addAll(Arrays.asList(
            uniPCES, uniPMES, uniPCIES, uniFUNREBOM, uniSEDH, uniPRODEST, uniSEDU,
            uniSEDURB, uniSECULT, uniDERES, uniSEAG, uniFEAC, uniSESPORT, uniPROESPORTE,
            uniSEJUS, uniPPES, uniIEMA, uniFUNDEMA, uniFEADM, uniFTP, uniFUNPEN, uniSCM
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

        Objeto objImplMan = new Objeto(
            "IMPLANTAÇÃO, MANUTENÇÃO E GERENCIAMENTO DOS SISTEMAS DE SINALIZAÇÕES DAS RODOVIAS ESTADUAIS - DER-ES",
            "Entrega", invSinalizacoes);

        Objeto objObras1 = new Objeto("Obras e Supervisão do Caminhos do Campo", "Entrega", invObras);
        Objeto objObras2 = new Objeto("Obras e Supervisão do Caminhos do Campo", "Entrega", invObras);

        Objeto objCentroExce1 = new Objeto(
            "CONSTRUÇÃO DO CENTRO DE EXCELÊNCIA DE ESPORTES PARA PESSOAS COM DEFICIÊNCIAS",
            "Entrega", invCentroExce);
        Objeto objCentroExce2 = new Objeto(
            "CONSTRUÇÃO DO CENTRO DE EXCELÊNCIA DE ESPORTES PARA PESSOAS COM DEFICIÊNCIAS",
            "Entrega", invCentroExce);

        Objeto objModeResso = new Objeto("MODERNIZAÇÃO DO PROCESSO DE RESSOCIALIZAÇÃO", "Projeto", invModeResso);

        Objeto objGestaoBens1 = new Objeto("GESTÃO DE BENS PATRIMONIAIS", "Projeto", invGestaoBens);
        Objeto objGestaoBens2 = new Objeto("GESTÃO DE BENS PATRIMONIAIS", "Projeto", invGestaoBens);

        Objeto objIEMA1 = new Objeto("IEMA DIGITAL", "Projeto", invIEMA);
        Objeto objIEMA2 = new Objeto("IMPLANTAÇÃO E ESTRUTURAÇÃO DE SERVIÇOS DIGITAIS", "Projeto", invIEMA);

        Objeto objGestaoEspaco = new Objeto("GESTÃO ESPAÇOS CULTURAIS E SEDE SECULT", "Projeto", invGestaoEspaco);

        Objeto objProjEspaciais = new Objeto("PROJETOS ESPECIAIS DO CONTRATO DE GESTÃO", "Projeto", invProjetosEspaciais);

        Objeto objConstrCampo = new Objeto("CONSTRUÇÃO DE CAMPO BOM DE BOLA", "Projeto", invConstrCampo);

        Objeto objNovoFundo = new Objeto("NOVO FUNDO CIDADES", "Projeto", invNovoFundo);

        Objeto objCentroEventos = new Objeto("CENTRO DE EVENTOS DO MORANGÃO - DOMINGOS MARTINS", "Entrega", invCentroEvento);

        Objeto objProjResso1 = new Objeto("PROJETOS DE RESSOCIALIZAÇÃO", "Projeto", invProjResso);
        Objeto objProjResso2 = new Objeto("PROJETOS DE RESSOCIALIZAÇÃO", "Projeto", invProjResso);
        Objeto objProjResso3 = new Objeto("PROJETOS DE RESSOCIALIZAÇÃO", "Projeto", invProjResso);

        Objeto objArcoViario = new Objeto("ARCO VIÁRIO DE COLATINA COM 4º PONTE", "Entrega", invArcoViario);

        Objeto objCarroTransp = new Objeto("CARRO DE TRANSPORTE DE AERONAVES", "Entrega", invCarroTransp);

        noObjetos.addAll(Arrays.asList(
            objAquiFrot1, objAquiFrot2, objAquiFrot3, objAquiFrot4, objAquiFrot5,
            objDigital1, objDigital2, objDrenagem, objCaisArtes, objImplMan,
            objObras1, objObras2, objCentroExce1, objCentroExce2, objModeResso,
            objGestaoBens1, objGestaoBens2, objIEMA1, objIEMA2, objGestaoEspaco,
            objProjEspaciais, objConstrCampo, objNovoFundo, objCentroEventos,
            objProjResso1 , objProjResso2, objProjResso3, objArcoViario,
            objCarroTransp
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

        Custo custoObjImpl2025 = new Custo("2025", 50000000, 50000000, objImplMan);
        Custo custoObjImpl2026 = new Custo("2026", 50000000, 50000000, objImplMan);
        Custo custoObjImpl2027 = new Custo("2027", 50000000, 50000000, objImplMan);

        Custo custoObjObras12025 = new Custo("2025", 8994010.17, 0, objObras1);
        Custo custoObjObras22026 = new Custo("2026", 3800000, 0, objObras1);
        Custo custoObjObras32027 = new Custo("2027", 3800000, 0, objObras1);

        Custo custoCentroExce12025F1 = new Custo("2025", 2476310.12, 0, objCentroExce1);
        Custo custoCentroExce22025F2 = new Custo("2025", 1159032.68, 1159032.68, objCentroExce2);

        Custo custoGestaoBens12025F1 = new Custo("2025", 2500000, 0, objGestaoBens1);
        Custo custoGestaoBens12026F1 = new Custo("2026", 2500000, 0, objGestaoBens1);
        Custo custoGestaoBens12027F1 = new Custo("2027", 2500000, 0, objGestaoBens1);
        
        Custo custoGestaoBens22025F1 = new Custo("2025", 1895541.16, 0, objGestaoBens2);
        Custo custoGestaoBens22026F1 = new Custo("2026", 1263694.11, 0, objGestaoBens2);
        Custo custoGestaoBens22027F1 = new Custo("2027", 1263694.11, 0, objGestaoBens2);

        Custo custoGestaoEspaco2025F1 = new Custo("2025", 2000000, 0, objGestaoEspaco);
        Custo custoGestaoEspaco2026F1 = new Custo("2025", 2000000, 0, objGestaoEspaco);

        Custo custoProjEspaciais2025F1 = new Custo("2025", 2344000, 0, objProjEspaciais);
        Custo custoProjEspaciais2026F1 = new Custo("2026", 2344000, 0, objProjEspaciais);
        Custo custoProjEspaciais2027F1 = new Custo("2027", 2344000, 0, objProjEspaciais);

        Custo custoConstrCampo2025F1 = new Custo("2025", 12673860.73, 30000000, objConstrCampo);
        Custo custoConstrCampo2025F2 = new Custo("2025",  500000.00, 500000, objConstrCampo);
        Custo custoConstrCampo2026F1 = new Custo("2026",  0, 15000000, objConstrCampo);
        Custo custoConstrCampo2027F1 = new Custo("2027",  0, 25000000, objConstrCampo);

        Custo custoNovoFundo2025F1 = new Custo("2025", 12526388.07, 12526388.07, objNovoFundo);
        Custo custoNovoFundo2026F1 = new Custo("2026", 240000000, 0, objNovoFundo);
        Custo custoNovoFundo2027F1 = new Custo("2027", 240000000, 0, objNovoFundo);

        Custo custoArcoViario2025F1 = new Custo("2025", 1243665.16, 1243665.16, objArcoViario);

        Custo custoCarroTransp2025F1 = new Custo("2025", 250000, 0, objCarroTransp);

        noCustos.addAll(Arrays.asList(
            custoObj12025, custoObj22025, custoObj32025, custoObj42025,
            custoObj12026, custoObj22026, custoObj32026, custoObj42026,
            custoObj12027, custoObj22027, custoObj32027, custoObj42027,
            custoObjDrenagem2025, custoObjCais2025,
            custoObjImpl2025, custoObjImpl2026, custoObjImpl2027,
            custoObjObras12025, custoObjObras22026, custoObjObras32027,
            custoCentroExce12025F1, custoCentroExce22025F2,
            custoGestaoBens12025F1, custoGestaoBens12026F1, custoGestaoBens12027F1,
            custoGestaoBens22025F1, custoGestaoBens22026F1, custoGestaoBens22027F1,
            custoGestaoEspaco2025F1, custoGestaoEspaco2026F1, custoProjEspaciais2025F1,
            custoProjEspaciais2026F1, custoProjEspaciais2027F1, custoConstrCampo2025F1,
            custoConstrCampo2025F2, custoConstrCampo2026F1, custoConstrCampo2027F1,
            custoNovoFundo2025F1, custoNovoFundo2026F1, custoNovoFundo2027F1,
            custoArcoViario2025F1, custoCarroTransp2025F1
        ));

        FonteOrcamentaria fonte1 = new FonteOrcamentaria("Fonte 1",
            Arrays.asList(
                custoObj12025, custoObj22025, custoObj32025, custoObj42025,
                custoObj12026, custoObj22026, custoObj32026, custoObj42026,
                custoObj12027, custoObj22027, custoObj32027, custoObj42027,
                custoObjDrenagem2025, custoObjCais2025,
                custoObjObras12025, custoObjObras22026, custoObjObras32027,
                custoCentroExce12025F1, custoGestaoBens12025F1, custoGestaoBens12026F1,
                custoGestaoBens12027F1, custoGestaoBens22025F1, custoGestaoBens22026F1,
                custoGestaoBens22027F1, custoGestaoEspaco2025F1, custoGestaoEspaco2026F1,
                custoProjEspaciais2025F1, custoProjEspaciais2026F1, custoProjEspaciais2027F1,
                custoConstrCampo2025F1, custoConstrCampo2026F1, custoConstrCampo2027F1,
                custoNovoFundo2025F1, custoNovoFundo2026F1, custoNovoFundo2027F1,
                custoArcoViario2025F1, custoCarroTransp2025F1
            ),
            Arrays.asList(
                execucaoAquisicao2025F1, execucaoCais2025F1, execucaoObras2025F1,
                execucaoModeResso2025F1, execucaoGestaoBens12025F1, execucaoGestaoBens22025F1,
                execucaoGestaoEspaco12025F1, execucaoConstrCampo2025F1, execucaoNovoFundo2025F1,
                execucaoCentroEvento2025F1, execucaoArcoViario2025F1
            )
        );
        FonteOrcamentaria fonte2 = new FonteOrcamentaria("Fonte 2",
            Arrays.asList( 
                custoObjImpl2025, custoObjImpl2026, custoObjImpl2027, custoCentroExce22025F2,
                custoConstrCampo2025F2
            ),
            Arrays.asList( execucaoAquisicao2025F2, execucaoSinalizacao2025F2, execucaoProjResso2025F2 ));
        
        noFonteOrcamentarias.addAll(Arrays.asList(fonte1, fonte2));

        populado = true;

    }


}
