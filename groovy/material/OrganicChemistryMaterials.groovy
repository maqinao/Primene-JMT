package material;

import static material.SuSyMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.properties.*

import supersymmetry.api.util.SuSyUtility;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;

public class OrganicChemistryMaterials {
    public static void register() {
        
        log.infoMC('Registering Organic Chemistry Materials!');

        FourNitrochlorobenzene = new Material.Builder(15000, SuSyUtility.susyId('four_nitrochlorobenzene'))
                .dust()
                .components(Carbon, 6, Hydrogen, 4, Chlorine, 1, Nitrogen, 1, Oxygen, 2)
                .colorAverage()
                .build();

        FourNitroaniline = new Material.Builder(15001, SuSyUtility.susyId('four_nitroaniline'))
                .dust()
                .components(Carbon, 6, Hydrogen, 6, Nitrogen, 2, Oxygen, 2)
                .colorAverage()
                .build();

        ParaPhenylenediamine = new Material.Builder(15002, SuSyUtility.susyId('para_phenylenediamine'))
                .dust()
                .components(Carbon, 6, Hydrogen, 8, Nitrogen, 2)
                .colorAverage()
                .build();

        TwoTwoDichlorohydrazobenzene = new Material.Builder(15003, SuSyUtility.susyId('two_two_dichlorohydrazobenzene'))
                .dust()
                .components(Carbon, 12, Hydrogen, 10, Chlorine, 2, Nitrogen, 2)
                .colorAverage()
                .build();

        SodiumPhenoxide = new Material.Builder(15004, SuSyUtility.susyId('sodium_phenoxide'))
                .dust()
                .components(Carbon, 6, Hydrogen, 5, Sodium, 1, Oxygen, 1)
                .colorAverage()
                .build();

        IsophthaloylDichloride = new Material.Builder(15005, SuSyUtility.susyId('isophthaloyl_dichloride'))
                .dust()
                .components(Carbon, 8, Hydrogen, 4, Chlorine, 2, Oxygen, 2)
                .colorAverage()
                .build();

        CaprolactamOxime = new Material.Builder(15006, SuSyUtility.susyId('caprolactam_oxime'))
                .dust()
                .components(Carbon, 6, Hydrogen, 11, Nitrogen, 1, Oxygen, 1)
                .colorAverage()
                .build();

        TNT = new Material.Builder(15007, SuSyUtility.susyId('tnt'))
                .dust()
                .components(Carbon, 7, Hydrogen, 5, Nitrogen, 3, Oxygen, 6)
                .color(0xacb38d)
                .build();

        Polystyrene = new Material.Builder(15008, SuSyUtility.susyId('polystyrene'))
                .polymer(1)
                .components(Carbon, 8, Hydrogen, 8)
                .color(0xa2a389)
                .build();

        OneTwoDichlorobenzene = new Material.Builder(15009, SuSyUtility.susyId('one_two_dichlorobenzene'))
                .dust()
                .components(Carbon, 6, Hydrogen, 4, Chlorine, 2)
                .colorAverage()
                .build();

        PolyvinylideneFluorine = new Material.Builder(15010, SuSyUtility.susyId('polyvinylidene_fluoride'))
                .polymer(1)
                .color(0xfde3ff)
                .flags(GENERATE_FOIL)
                .components(Carbon, 2, Hydrogen, 2, Fluorine, 2)
                .fluidTemp(468)
                .build()

        Methylenedianiline = new Material.Builder(15011, SuSyUtility.susyId('methylenedianiline'))
                .dust()
                .components(Carbon, 13, Hydrogen, 14, Nitrogen, 2)
                .colorAverage()
                .build()

        MethyleneDiphenylDiisocyanate = new Material.Builder(15012, SuSyUtility.susyId('methylene_diphenyl_diisocyanate'))
                .dust()
                .components(Carbon, 15, Hydrogen, 10, Nitrogen, 2, Oxygen, 2)
                .colorAverage()
                .build()

        MemoryFoam = new Material.Builder(15013, SuSyUtility.susyId('memory_foam'))
                .polymer(1)
                .flags(GENERATE_PLATE)
                .color(0xFFFFFF)
                .fluidTemp(438)
                .build()

        Rayon = new Material.Builder(15014, SuSyUtility.susyId('rayon'))
                .polymer(1)
                .components(Carbon, 6, Hydrogen, 10, Oxygen, 5)
                .flags(GENERATE_FINE_WIRE)
                .color(0xaee8d9)
                .fluidTemp(438)
                .build()
                .setFormula('C6H5(OH)4OH', true);

        AlkaliCellulose = new Material.Builder(15015, SuSyUtility.susyId('alkali_cellulose'))
                .dust()
                .components(Carbon, 6, Hydrogen, 9, Oxygen, 5, Sodium, 1)
                .color(0x7d6547)
                .build()

        SodiumCelluloseXanthate = new Material.Builder(15016, SuSyUtility.susyId('sodium_cellulose_xanthate'))
                .dust()
                .components(Carbon, 6, Hydrogen, 9, Oxygen, 5, Carbon, 1, Sulfur, 2, Sodium, 1)
                .color(0x7d6057)
                .build()

        PMMA = new Material.Builder(15017, SuSyUtility.susyId('pmma'))
                .polymer(1)
                .color(0x72e0c9)
                .flags(GENERATE_FOIL)
                .components(Carbon, 5, Oxygen, 2, Hydrogen, 8)
                .fluidTemp(438)
                .build()

        PhthalicAnhydride = new Material.Builder(15018, SuSyUtility.susyId('phthalic_anhydride'))
                .dust()
                .components(Carbon, 8, Hydrogen, 4, Oxygen, 3)
                .colorAverage()
                .build();

        TributylPhosphate = new Material.Builder(15019, SuSyUtility.susyId('tributyl_phosphate'))
                .fluid()
                .components(Carbon, 12, Hydrogen, 27, Oxygen, 4, Phosphorus, 1)
                .color(0xf5e3b3)
                .build();

        CrudeStyrene = new Material.Builder(15020, SuSyUtility.susyId('crude_styrene'))
                .fluid()
                .color(0x4d4d3e)
                .build();

        ChlorinatedMethaneMixture = new Material.Builder(15021, SuSyUtility.susyId('chlorinated_methane_mixture'))
                .fluid(FluidTypes.GAS)
                .color(0x8327d9)
                .build();

        ChlorinatedChloromethaneMixture = new Material.Builder(15022, SuSyUtility.susyId('chlorinated_chloromethane_mixture'))
                .fluid(FluidTypes.GAS)
                .color(0x6124bd)
                .build();

        ChlorinatedDichloromethaneMixture = new Material.Builder(15023, SuSyUtility.susyId('chlorinated_dichloromethane_mixture'))
                .fluid(FluidTypes.GAS)
                .color(0x4922a3)
                .build();

        ChloromethaneSolution = new Material.Builder(15024, SuSyUtility.susyId('chloromethane_solution'))
                .fluid()
                .components(Water, 1, Chloromethane, 1)
                .colorAverage()
                .build();

        AcidicChlorodifluoromethane = new Material.Builder(15025, SuSyUtility.susyId('acidic_chlorodifluoromethane'))
                .fluid(FluidTypes.GAS)
                .color(0xbd97c7)
                .build();

        AcidicTetrafluoroethylene = new Material.Builder(15026, SuSyUtility.susyId('acidic_tetrafluoroethylene'))
                .fluid(FluidTypes.GAS)
                .color(0x726678)
                .build();

        TrinitromethaneSolution = new Material.Builder(15027, SuSyUtility.susyId('trinitromethane_solution'))
                .fluid()
                .color(0x333c52)
                .build();

        TetranitronmethaneSolution = new Material.Builder(15028, SuSyUtility.susyId('tetranitromethane_solution'))
                .fluid()
                .color(0x373352)
                .build();

        ImpureDimethyldichloroSilane = new Material.Builder(15029, SuSyUtility.susyId('impure_dimethyldichlorosilane'))
                .fluid()
                .color(0x291e38)
                .build();

        ChlorinatedGlycerol = new Material.Builder(15030, SuSyUtility.susyId('chlorinated_glycerol'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 6, Oxygen, 1, Chlorine, 2)
                .colorAverage()
                .build();

        EpichlorohydrinSolution = new Material.Builder(15031, SuSyUtility.susyId('epichlorohydrin_solution'))
                .fluid()
                .color(0x9c6241)
                .build();

        AllylAlcoholMix = new Material.Builder(15032, SuSyUtility.susyId('allyl_alcohol_mix'))
                .fluid()
                .color(0xbede9b)
                .build();

        DilutedEpichlorohydrin = new Material.Builder(15033, SuSyUtility.susyId('diluted_epichlorohydrin'))
                .fluid()
                .color(0x91664d)
                .build();

        Isobutane = new Material.Builder(15034, SuSyUtility.susyId('isobutane'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 4, Hydrogen, 10)
                .color(0x8a7566)
                .build();

        Isobutylene = new Material.Builder(15035, SuSyUtility.susyId('isobutylene'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 4, Hydrogen, 8)
                .color(0x917d61)
                .build();

        TriarylsulfoniumHexafluoroantimonate = new Material.Builder(15036, SuSyUtility.susyId('triarylsulfonium_hexafluoroantimonate'))
                .dust()
                .components(Carbon, 24, Hydrogen, 19, Fluorine, 6, Sulfur, 2, Antimony, 1)
                .color(0x31a374)
                .build();

        NMethylIIPyrrolidone = new Material.Builder(15037, SuSyUtility.susyId('n_methyl_ii_pyrrolidone'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 9, Nitrogen, 1, Oxygen, 1)
                .colorAverage()
                .build();

        SaltyNMethylIIPyrrolidone = new Material.Builder(15038, SuSyUtility.susyId('salty_n_methyl_ii_pyrrolidone'))
                .fluid()
                .components(NMethylIIPyrrolidone, 1, Salt, 1)
                .colorAverage()
                .build();

        MethylAcetateSolution = new Material.Builder(15039, SuSyUtility.susyId('methyl_acetate_solution'))
                .fluid()
                .components(Water, 1, SulfuricAcid, 1, MethylAcetate, 1)
                .colorAverage()
                .build();

        TwoNitrochlorobenzene = new Material.Builder(15040, SuSyUtility.susyId('two_nitrochlorobenzene'))
                .dust().fluid()
                .components(Carbon, 6, Hydrogen, 4, Chlorine, 1, Nitrogen, 1, Oxygen, 2)
                .color(0xc7c944)
                .build();

        MixedNitrochlorobenzene = new Material.Builder(15041, SuSyUtility.susyId('mixed_nitrochlorobenzene'))
                .dust().fluid()
                .color(0xa4a644)
                .build();

        FourNitroanilineSolution = new Material.Builder(15042, SuSyUtility.susyId('four_nitroaniline_solution'))
                .fluid()
                .components(Toluene, 1, FourNitroaniline, 1)
                .colorAverage()
                .build();

        ParaPhenylenediamineSolution = new Material.Builder(15043, SuSyUtility.susyId('para_phenylenediamine_solution'))
                .fluid()
                .components(Toluene, 1, ParaPhenylenediamine, 1)
                .colorAverage()
                .build();

        TwoTwoDichlorohydrazobenzeneSolution = new Material.Builder(15044, SuSyUtility.susyId('two_two_dichlorohydrazobenzene_solution'))
                .fluid()
                .components(Toluene, 1, TwoTwoDichlorohydrazobenzene, 1)
                .colorAverage()
                .build();

        DichlorobenzidineSolution = new Material.Builder(15045, SuSyUtility.susyId('dichlorobenzidine_solution'))
                .fluid()
                .components(Toluene, 1, Dichlorobenzidine, 1)
                .colorAverage()
                .build();

        Xylene = new Material.Builder(15046, SuSyUtility.susyId('xylene'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 10)
                .color(0x2e281f)
                .build();

        Phosgene = new Material.Builder(15047, SuSyUtility.susyId('phosgene'))
                .fluid()
                .components(Carbon, 1, Oxygen, 1, Chlorine, 2)
                .colorAverage()
                .build();

        Dichloroethane = new Material.Builder(15048, SuSyUtility.susyId('dichloroethane'))
                .fluid()
                .components(Carbon, 2, Hydrogen, 4, Chlorine, 2)
                .colorAverage()
                .build();

        Propionaldehyde = new Material.Builder(15049, SuSyUtility.susyId('propionaldehyde'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 6, Oxygen, 1)
                .color(0x917b0f)
                .build();

        Cyclohexylamine = new Material.Builder(15050, SuSyUtility.susyId('cyclohexylamine'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 13, Nitrogen, 1)
                .color(0xbfba8c)
                .build();

        DiphenylIsophthalateSolution = new Material.Builder(15051, SuSyUtility.susyId('diphenyl_isophthalate_solution'))
                .fluid()
                .components(Water, 2, Dichloroethane, 1, DiphenylIsophtalate, 1)
                .colorAverage()
                .build();

        DiaminobenzidineSolution = new Material.Builder(15052, SuSyUtility.susyId('diaminobenzidine_solution'))
                .fluid()
                .components(Water, 1, Toluene, 1, Diaminobenzidine, 1)
                .colorAverage()
                .build();

        PBIPolymerizationMix = new Material.Builder(15053, SuSyUtility.susyId('pbi_polymerization_mix'))
                .fluid()
                .color(0x40342b)
                .fluidTemp(450)
                .build();

        PBIPrePolymerFoam = new Material.Builder(15054, SuSyUtility.susyId('pbi_pre_polymer_foam'))
                .fluid()
                .color(0x332d28)
                .fluidTemp(450)
                .build();

        ImpurePBISolution = new Material.Builder(15055, SuSyUtility.susyId('impure_pbi_solution'))
                .fluid()
                .color(0x292623)
                .fluidTemp(450)
                .build();

        Dimethylacetamide = new Material.Builder(15056, SuSyUtility.susyId('dimethylacetamide'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 9, Nitrogen, 1, Oxygen, 1)
                .colorAverage()
                .build();

        PBISolution = new Material.Builder(15057, SuSyUtility.susyId('pbi_solution'))
                .fluid()
                .components(Dimethylacetamide, 1, Polybenzimidazole, 7)
                .color(0x171410)
                .build();

        PBIWaste = new Material.Builder(15058, SuSyUtility.susyId('pbi_waste'))
                .fluid()
                .color(0x202226)
                .build();

        Hydroxylamine = new Material.Builder(15059, SuSyUtility.susyId('hydroxylamine'))
                .fluid()
                .components(Hydrogen, 3, Nitrogen, 1, Oxygen, 1)
                .colorAverage()
                .build();

        Cyclohexanone = new Material.Builder(15060, SuSyUtility.susyId('cyclohexanone'))
                .fluid()
                .components(Hydrogen, 3, Nitrogen, 1, Oxygen, 1)
                .color(0x2b1e11)
                .build();

        NHexadecylammoniumAcetate = new Material.Builder(15061, SuSyUtility.susyId('n_hexadecylammonium_acetate'))
                .dust()
                .components(Carbon, 16, Hydrogen, 39, Nitrogen, 1, Oxygen, 2)
                .color(0xffd4d4)
                .build();

        CaprolactamSolution = new Material.Builder(15062, SuSyUtility.susyId('caprolactam_solution'))
                .fluid()
                .components(AmmoniumSulfate, 1, Caprolactam, 1, Water, 2)
                .colorAverage()
                .build();

        Chlorotrimethylsilane = new Material.Builder(15063, SuSyUtility.susyId("chlorotrimethylsilane"))
                .fluid()
                .components(Carbon, 3, Hydrogen, 9, Silicon, 1, Chlorine, 1)
                .color(0xd9dddc)
                .build();

        Chlorotrimethylsilane.setFormula("(CH3)3SiCl", true)

        Methyldichlorosilane = new Material.Builder(15064, SuSyUtility.susyId("methyldichlorosilane"))
                .fluid()
                .components(Carbon, 1, Hydrogen, 4, Chlorine, 2, Silicon, 1)
                .color(0xd9dddc)
                .build();

        Methyldichlorosilane.setFormula("CH3Cl2SiH", true)

        Methyltrichlorosilane = new Material.Builder(15065, SuSyUtility.susyId("methyltrichlorosilane"))
                .fluid()
                .components(Carbon, 1, Hydrogen, 3, Silicon, 1, Chlorine, 3)
                .color(0xd9dddc)
                .build();

        Methyltrichlorosilane.setFormula("CH3SiCl3", true)

        TNTSolution = new Material.Builder(15066, SuSyUtility.susyId('tnt_solution'))
                .fluid()
                .components(TNT, 1, DilutedSulfuricAcid, 1)
                .colorAverage()
                .build();

        VinylChlorideSuspension = new Material.Builder(15067, SuSyUtility.susyId('vinyl_chloride_suspension'))
                .fluid()
                .components(Water, 1, VinylChloride, 1)
                .colorAverage()
                .build();

        PolyvinylChlorideSuspension = new Material.Builder(15068, SuSyUtility.susyId('polyvinyl_chloride_suspension'))
                .fluid()
                .components(Water, 1, PolyvinylChloride, 1)
                .colorAverage()
                .build();

        StyreneSolution = new Material.Builder(15069, SuSyUtility.susyId('styrene_solution'))
                .fluid()
                .components(Water, 1, Styrene, 1)
                .colorAverage()
                .build();

        PolystyreneSolution = new Material.Builder(15070, SuSyUtility.susyId('polystyrene_solution'))
                .fluid()
                .components(Water, 1, Polystyrene, 1)
                .colorAverage()
                .build();

        VinylAcetateSolution = new Material.Builder(15071, SuSyUtility.susyId('vinyl_acetate_solution'))
                .fluid()
                .components(Methanol, 1, VinylAcetate, 1)
                .colorAverage()
                .build();

        PolyvinylAcetateSolution = new Material.Builder(15072, SuSyUtility.susyId('polyvinyl_acetate_solution'))
                .fluid()
                .components(Methanol, 1, PolyvinylAcetate, 1)
                .colorAverage()
                .build();

        Bleach = new Material.Builder(15073, SuSyUtility.susyId('bleach'))
                .fluid()
                .components(Water, 1, Sodium, 1, Chlorine, 1, Oxygen, 1)
                .colorAverage()
                .build();

        ImpureBleach = new Material.Builder(15074, SuSyUtility.susyId('impure_bleach'))
                .fluid()
                .components(Water, 3, Bleach, 1, Salt, 1)
                .colorAverage()
                .build();

        OneFourDichlorobenzeneSolution = new Material.Builder(15075, SuSyUtility.susyId('one_four_dichlorobenzene_solution'))
                .fluid()
                .components(Toluene, 1, Dichlorobenzene, 1)
                .colorAverage()
                .build();

        OneTwoDichlorobenzeneSolution = new Material.Builder(15076, SuSyUtility.susyId('one_two_dichlorobenzene_solution'))
                .fluid()
                .components(Toluene, 1, OneTwoDichlorobenzene, 1)
                .colorAverage()
                .build();

        DryEthanol = new Material.Builder(15077, SuSyUtility.susyId('dry_ethanol'))
                .fluid()
                .components(Ethanol, 1)
                .color(0xeb6b34)
                .build();

        StyreneButadieneSolution = new Material.Builder(15078, SuSyUtility.susyId('styrene_butadiene_solution'))
                .fluid()
                .components(Styrene, 1, Butadiene, 1, Ethanol, 1)
                .colorAverage()
                .build();

        OneBromobutane = new Material.Builder(15079, SuSyUtility.susyId('one_bromobutane'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 9, Bromine, 1)
                .colorAverage()
                .build();

        DilutedOneBromobutane = new Material.Builder(15080, SuSyUtility.susyId('diluted_one_bromobutane'))
                .fluid()
                .components(Water, 1, OneBromobutane, 1)
                .colorAverage()
                .build();

        Butyllithium = new Material.Builder(15081, SuSyUtility.susyId('butyllithium'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 9, Lithium, 1)
                .colorAverage()
                .build();

        DilutedButyllithium = new Material.Builder(15082, SuSyUtility.susyId('diluted_butyllithium'))
                .fluid()
                .components(Water, 1, Butyllithium, 1)
                .colorAverage()
                .build();

        PolymerizedStyreneButadieneSolution = new Material.Builder(15083, SuSyUtility.susyId('polymerized_styrene_butadiene_solution'))
                .fluid()
                .color(0x332e2c)
                .color(0x3d2509)
                .build();

        MethylFormate = new Material.Builder(15084, SuSyUtility.susyId('methyl_formate'))
                .fluid()
                .components(Carbon, 2, Hydrogen, 4, Oxygen, 2)
                .colorAverage()
                .build();

        MethylFormateSolution = new Material.Builder(15085, SuSyUtility.susyId('methyl_formate_solution'))
                .fluid(FluidTypes.GAS)
                .components(Water, 1, MethylFormate, 1, SodiumHydroxide, 1)
                .colorAverage()
                .build();

        Acetylene = new Material.Builder(15086, SuSyUtility.susyId('acetylene'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 2, Hydrogen, 2)
                .colorAverage()
                .build();

        TetrapropylammoniumBromide = new Material.Builder(15087, SuSyUtility.susyId('tetrapropylammonium_bromide'))
                .fluid()
                .components(Carbon, 12, Hydrogen, 28, Bromine, 1, Nitrogen, 1)
                .color(0x916c0f)
                .build();

        Formaldehyde = new Material.Builder(15088, SuSyUtility.susyId('formaldehyde'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 1, Hydrogen, 2, Oxygen, 1)
                .colorAverage()
                .build();

        MethylamineMix = new Material.Builder(15089, SuSyUtility.susyId('methylamine_mix'))
                .fluid()
                .color(0x6b4ea6)
                .build();

        Methylamine = new Material.Builder(15090, SuSyUtility.susyId('methylamine'))
                .fluid()
                .components(Carbon, 1, Hydrogen, 5, Nitrogen, 1)
                .color(0x794c91)
                .build()
                .setFormula('CH3NH2', true);

        Trimethylamine = new Material.Builder(15091, SuSyUtility.susyId('trimethylamine'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 9, Nitrogen, 1)
                .color(0x4c2461)
                .build();

        Butynediol = new Material.Builder(15092, SuSyUtility.susyId('butynediol'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 6, Oxygen, 2)
                .colorAverage()
                .build();

        Butanediol = new Material.Builder(15093, SuSyUtility.susyId('butanediol'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 2)
                .colorAverage()
                .build();

        GammaButyrolactone = new Material.Builder(15094, SuSyUtility.susyId('gamma_butyrolactone'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 6, Oxygen, 2)
                .color(0x4242f5)
                .build();

        DilutedMethylIIPyrrolidone = new Material.Builder(15095, SuSyUtility.susyId('diluted_methyl_ii_pyrrolidone'))
                .fluid()
                .components(Water, 1, NMethylIIPyrrolidone, 1)
                .colorAverage()
                .build();

        DimethyldichlorosilaneEmulsion = new Material.Builder(15096, SuSyUtility.susyId('dimethyldichlorosilane_emulsion'))
                .fluid()
                .color(0x542a4c)
                .build();

        TetrafluoroethyleneEmulsion = new Material.Builder(15097, SuSyUtility.susyId('tetrafluoroethylene_emulsion'))
                .fluid()
                .color(0x3b2e38)
                .build();

        Dichloromethane = new Material.Builder(15098, SuSyUtility.susyId('dichloromethane'))
                .fluid()
                .components(Carbon, 1, Hydrogen, 2, Chlorine, 2)
                .colorAverage()
                .build();

        CarbonTetrachloride = new Material.Builder(15099, SuSyUtility.susyId('carbon_tetrachloride'))
                .fluid()
                .components(Carbon, 1, Chlorine, 4)
                .colorAverage()
                .build();

        IsophthalicAcid = new Material.Builder(15100, SuSyUtility.susyId('isophthalic_acid'))
                .dust()
                .components(Carbon, 8, Hydrogen, 6, Oxygen, 4)
                .color(0x349972)
                .build()

        NPropanol = new Material.Builder(15101, SuSyUtility.susyId('n_propanol'))
                .fluid()
                .components()
                .color(0xad9113)
                .build();

        NPropanol.setFormula('CH3CH2CH2OH', true)

        PolytetrafluoroethyleneSolution = new Material.Builder(15102, SuSyUtility.susyId('polytetrafluoroethylene_solution'))
                .fluid()
                .components(Water, 1, Polytetrafluoroethylene, 1)
                .colorAverage()
                .build();

        MixedNitrochlorobenzeneSolution = new Material.Builder(15103, SuSyUtility.susyId('mixed_nitrochlorobenzene_solution'))
                .fluid()
                .color(0xc18c18)
                .build();

        MixedDichlorobenzeneSolution = new Material.Builder(15104, SuSyUtility.susyId('mixed_dichlorobenzene_solution'))
                .fluid()
                .color(0xFF7F7F)
                .build();

        Novolacs = new Material.Builder(15105, SuSyUtility.susyId('novolacs'))
                .fluid()
                .color(0xbfa26f)
                .build();

        SiliconTetrachloride = new Material.Builder(15106, SuSyUtility.susyId('silicon_tetrachloride'))
                .fluid()
                .components(Silicon, 1, Chlorine, 4)
                .color(0x63827f)
                .build();

        PurifiedSiliconTetrachloride = new Material.Builder(15107, SuSyUtility.susyId('purified_silicon_tetrachloride'))
                .fluid()
                .components(Silicon, 1, Chlorine, 4)
                .color(0x7fa3a0)
                .build();

        Ethanolamine = new Material.Builder(15108, SuSyUtility.susyId('ethanolamine'))
                .fluid()
                .components(Carbon, 2, Hydrogen, 7, Nitrogen, 1, Oxygen, 1)
                .color(0x56a6e3)
                .build();

        Diethanolamine = new Material.Builder(15109, SuSyUtility.susyId('diethanolamine'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 11, Nitrogen, 1, Oxygen, 2)
                .color(0x4296d6)
                .build();

        Triethanolamine = new Material.Builder(15110, SuSyUtility.susyId('triethanolamine'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 15, Nitrogen, 1, Oxygen, 3)
                .color(0x2e86c9)
                .build();

        EthyleneGlycol = new Material.Builder(15111, SuSyUtility.susyId('ethylene_glycol'))
                .fluid()
                .components(Carbon, 2, Hydrogen, 6, Oxygen, 2)
                .color(0x2e86c9)
                .build();

        EthyleneOxide = new Material.Builder(15112, SuSyUtility.susyId('ethylene_oxide'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 2, Hydrogen, 4, Oxygen, 1)
                .colorAverage()
                .build();

        EthanolamineMix = new Material.Builder(15113, SuSyUtility.susyId('ethanolamine_mix'))
                .fluid()
                .color(0x3e86bd)
                .build();

        RichAmine = new Material.Builder(15114, SuSyUtility.susyId('rich_amine'))
                .fluid()
                .color(0x3ea8bd)
                .build();

        Pentane = new Material.Builder(15115, SuSyUtility.susyId('pentane'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 12)
                .color(0xe8e7be)
                .build();

        Hexane = new Material.Builder(15116, SuSyUtility.susyId('hexane'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 14)
                .color(0xcfceb6)
                .build();

        Furfural = new Material.Builder(15117, SuSyUtility.susyId('furfural'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 4, Oxygen, 2)
                .colorAverage()
                .build();

        Cresol = new Material.Builder(15118, SuSyUtility.susyId('cresol'))
                .fluid()
                .components(Carbon, 7, Hydrogen, 8, Oxygen, 1)
                .color(0x827863)
                .build();

        Xylenol = new Material.Builder(15120, SuSyUtility.susyId('xylenol'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 10, Oxygen, 1)
                .color(0x693834)
                .build();

        Creosol = new Material.Builder(15121, SuSyUtility.susyId('creosol'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 10, Oxygen, 2)
                .color(0x473339)
                .build();

        Anthracene = new Material.Builder(15122, SuSyUtility.susyId('anthracene'))
                .fluid()
                .components(Carbon, 14, Hydrogen, 10)
                .color(0x000000)
                .build();

        Triethylenediamine = new Material.Builder(15123, SuSyUtility.susyId('triethylenediamine'))
                .dust()
                .components(Carbon, 6, Hydrogen, 12, Nitrogen, 2)
                .colorAverage()
                .build()

        Polyurethane = new Material.Builder(15124, SuSyUtility.susyId('polyurethane'))
                .polymer(1)
                .components(Carbon, 17, Hydrogen, 16, Nitrogen, 2, Oxygen, 4)
                .color(0xd1d1d1)
                .flags(GENERATE_FINE_WIRE)
                .fluidTemp(438)
                .build()
                .setFormula('(C15H10N2O2)(C2H6O2)', true);

        DiethylEther = new Material.Builder(15125, SuSyUtility.susyId('diethyl_ether'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 1)
                .colorAverage()
                .build()
                .setFormula('(C2H5)2O', true);

        Polypropylene = new Material.Builder(15126, SuSyUtility.susyId('polypropylene'))
                .polymer(1)
                .components(Carbon, 3, Hydrogen, 6)
                .color(0xdfe39a)
                .flags(GENERATE_FOIL)
                .build();

        Dimethylformamide = new Material.Builder(15127, SuSyUtility.susyId('dimethylformamide'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 7, Nitrogen, 1)
                .colorAverage()
                .build()
                .setFormula('(CH3)2NCH', true);

        CativaProcessCatalyst = new Material.Builder(15128, SuSyUtility.susyId('cativa_process_catalyst'))
                .dust()
                .color(0x695449)
                .build()
                .setFormula('[PPN][IrI2(CO)2]', true);

        TwoEthylanthraquinone = new Material.Builder(15129, SuSyUtility.susyId('two_ethylanthraquinone'))
                .fluid()
                .components(Carbon, 16, Hydrogen, 12, Oxygen, 2)
                .colorAverage()
                .build()

        TwoEthylanthrahydroquinone = new Material.Builder(15130, SuSyUtility.susyId('two_ethylanthrahydroquinone'))
                .fluid()
                .components(Carbon, 16, Hydrogen, 14, Oxygen, 2)
                .colorAverage()
                .build()

        Butanone = new Material.Builder(15131, SuSyUtility.susyId('butanone'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 8, Oxygen, 1)
                .colorAverage()
                .build()

        Durene = new Material.Builder(15132, SuSyUtility.susyId('durene'))
                .dust()
                .components(Carbon, 10, Hydrogen, 14)
                .colorAverage()
                .build()

        PyromelliticDianhydride = new Material.Builder(15133, SuSyUtility.susyId('pyromellitic_dianhydride'))
                .dust()
                .components(Carbon, 10, Hydrogen, 2, Oxygen, 6)
                .colorAverage()
                .build()

        FourFourOxydianiline = new Material.Builder(15134, SuSyUtility.susyId('four_four_oxydianiline'))
                .dust()
                .components(Carbon, 12, Hydrogen, 12, Nitrogen, 2, Oxygen, 1)
                .colorAverage()
                .build()

        KaptonK = new Material.Builder(15135, SuSyUtility.susyId('kapton_k'))
                .polymer(1)
                .components(Carbon, 22, Hydrogen, 10, Nitrogen, 2, Oxygen, 5)
                .color(0xfabe19)
                .build()

        KaptonE = new Material.Builder(15136, SuSyUtility.susyId('kapton_e'))
                .polymer(1)
                .components(Carbon, 22, Hydrogen, 10, Nitrogen, 2, Oxygen, 5)
                .color(0xdcfa19)
                .build()

        TwoButanol = new Material.Builder(15137, SuSyUtility.susyId('two_butanol'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 1)
                .colorAverage()
                .build()

        Acetamide = new Material.Builder(15138, SuSyUtility.susyId('acetamide'))
                .dust()
                .components(Carbon, 2, Hydrogen, 5, Nitrogen, 1, Oxygen, 1)
                .colorAverage()
                .build()

        Hydrazine = new Material.Builder(15139, SuSyUtility.susyId('hydrazine'))
                .fluid()
                .components(Nitrogen, 2, Hydrogen, 4)
                .colorAverage()
                .build()

        Ethylenediamine = new Material.Builder(15140, SuSyUtility.susyId('ethylenediamine'))
                .fluid()
                .components(Carbon, 2, Hydrogen, 8, Nitrogen, 2)
                .colorAverage()
                .build()

        Pyrocatechol = new Material.Builder(15141, SuSyUtility.susyId('pyrocatechol'))
                .dust()
                .components(Carbon, 6, Hydrogen, 6, Oxygen, 2)
                .colorAverage()
                .build()

        AcetoneCyanohydrin = new Material.Builder(15142, SuSyUtility.susyId('acetone_cyanohydrin'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 7, Nitrogen, 1, Oxygen, 1)
                .colorAverage()
                .build()

        MethylMethacrylate = new Material.Builder(15143, SuSyUtility.susyId('methyl_methacrylate'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 8, Oxygen, 2)
                .colorAverage()
                .build()

        MethylMethacrylateEmulsion = new Material.Builder(15144, SuSyUtility.susyId('methyl_methacrylate_emulsion'))
                .fluid()
                .color(0x789c94)
                .build()

        PolymethylMethacrylateSolution = new Material.Builder(15145, SuSyUtility.susyId('polymethyl_methacrylate_solution'))
                .fluid()
                .color(0x79baad)
                .build()

        PolystyreneSulfonate = new Material.Builder(15146, SuSyUtility.susyId('polystyrene_sulfonate'))
                .polymer(1)
                .color(0x8f795e)
                .build()
                .setFormula('(CH2CHC6H4SO3H)', true)

        EthylenediaminetetraaceticAcid = new Material.Builder(15147, SuSyUtility.susyId('ethylenediaminetetraacetic_acid'))
                .dust()
                .components(Carbon, 10, Hydrogen, 16, Nitrogen, 2, Oxygen, 8)
                .colorAverage()
                .build()

        TetrasodiumEthylenediaminetetraaceticAcid = new Material.Builder(15148, SuSyUtility.susyId('tetrasodium_ethylenediaminetetraacetic_acid'))
                .dust()
                .components(Carbon, 10, Hydrogen, 12, Nitrogen, 2, Sodium, 4, Oxygen, 8)
                .colorAverage()
                .build()

        Urea = new Material.Builder(15149, SuSyUtility.susyId('urea'))
                .dust()
                .components(Carbon, 1, Oxygen, 1, Nitrogen, 2, Hydrogen, 4)
                .colorAverage()
                .build()

        Urea.setFormula('CO(NH2)2', true)

        Diiodobenzene = new Material.Builder(15150, SuSyUtility.susyId('diiodobenzene'))
                .dust()
                .components(Carbon, 6, Hydrogen, 4, Iodine, 2)
                .colorAverage()
                .build()

        TerephthalicAcid = new Material.Builder(15151, SuSyUtility.susyId('terephthalic_acid'))
                .dust()
                .components(Carbon, 8, Hydrogen, 6, Oxygen, 4)
                .colorAverage()
                .build()

        Bistrichloromethylbenzene = new Material.Builder(15152, SuSyUtility.susyId('bistrichloromethylbenzene'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 4, Carbon, 2, Chlorine, 6)
                .colorAverage()
                .build()
                .setFormula('C6H4(CCl3)2', true)

        TerephthaloylChloride = new Material.Builder(15153, SuSyUtility.susyId('terephthaloyl_chloride'))
                .dust()
                .components(Carbon, 8, Hydrogen, 4, Chlorine, 2, Oxygen, 2)
                .colorAverage()
                .build()

        Kevlar = new Material.Builder(15154, SuSyUtility.susyId('kevlar'))
                .polymer(3)
                .color(0x4d443e)
                .flags(GENERATE_PLATE, GENERATE_FINE_WIRE)
                .build()

        Kevlar.setFormula('COC6H4CONHC6H4NH', true)

        BiphenylTetracarboxylicAcidDianhydride = new Material.Builder(15155, SuSyUtility.susyId('biphenyl_tetracarboxylic_acid_dianhydride'))
                .dust()
                .components(Carbon, 16, Hydrogen, 16, Oxygen, 6)
                .colorAverage()
                .build()

        CelluloseAcetate = new Material.Builder(15157, SuSyUtility.susyId('cellulose_acetate'))
                .polymer()
                .flags(GENERATE_FINE_WIRE)
                .components(Carbon, 76, Hydrogen, 114, Oxygen, 49)
                .color(0xd4c9ab)
                .build()

        Pyridine = new Material.Builder(15158, SuSyUtility.susyId('pyridine'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 5, Nitrogen, 1)
                .color(0x202836)
                .build()

        Quinoline = new Material.Builder(15159, SuSyUtility.susyId('quinoline'))
                .fluid()
                .components(Carbon, 9, Hydrogen, 7, Nitrogen, 1)
                .color(0x2e3620)
                .build()

        DimethylCarbonate = new Material.Builder(15160, SuSyUtility.susyId('dimethyl_carbonate'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 6, Oxygen, 3)
                .colorAverage()
                .build()

        DiethyleneGlycol = new Material.Builder(15161, SuSyUtility.susyId('diethylene_glycol'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 3)
                .color(0x2ec9c1)
                .build()

        DiglycolicAcid = new Material.Builder(15162, SuSyUtility.susyId('diglycolic_acid'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 6, Oxygen, 5)
                .colorAverage()
                .build()

        NOctanol = new Material.Builder(15163, SuSyUtility.susyId('n_octanol'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 18, Oxygen, 1)
                .color(0xbf8454)
                .build()

        NOctanol.setFormula('C8H17OH', true)

        NOctylamine = new Material.Builder(15164, SuSyUtility.susyId('n_octylamine'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 19, Nitrogen, 1)
                .color(0xeb8634)
                .build()

        Dioctylamine = new Material.Builder(15165, SuSyUtility.susyId('dioctylamine'))
                .fluid()
                .components(Carbon, 16, Hydrogen, 35, Nitrogen, 1)
                .colorAverage()
                .build()

        TetraoctylDiglycolamide = new Material.Builder(15166, SuSyUtility.susyId('tetraoctyl_diglycolamide'))
                .fluid()
                .components(Carbon, 36, Hydrogen, 72, Nitrogen, 2, Oxygen, 3)
                .colorAverage()
                .build()

        TwoEthylTwoHexenal = new Material.Builder(15167, SuSyUtility.susyId('two_ethyl_two_hexenal'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 14, Oxygen, 1)
                .colorAverage()
                .build()

        TwoEthylhexanol = new Material.Builder(15168, SuSyUtility.susyId('two_ethylhexanol'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 18, Oxygen, 1)
                .colorAverage()
                .build()

        DiTwoEthylhexylPhosphoricAcid = new Material.Builder(15169, SuSyUtility.susyId('di_two_ethylhexyl_phosphoric_acid'))
                .fluid()
                .components(Carbon, 16, Hydrogen, 35, Oxygen, 4, Phosphorus, 1)
                .color(0xb5a677)
                .build()

        DiTwoEthylhexylPhosphoricAcid.setFormula('(C8H17O)2PO(OH)2', true)

        LauricAcid = new Material.Builder(15170, SuSyUtility.susyId('lauric_acid'))
                .fluid()
                .components(Carbon, 12, Hydrogen, 24, Oxygen, 2)
                .color(0xe39c32)
                .build()

        CapricAcid = new Material.Builder(15171, SuSyUtility.susyId('capric_acid'))
                .fluid()
                .components(Carbon, 10, Hydrogen, 20, Oxygen, 2)
                .color(0xe3ba32)
                .build()

        PrimaryAmineN = new Material.Builder(15172, SuSyUtility.susyId('primary_amine_n'))
                .fluid()
                .components(Carbon, 20, Hydrogen, 43, Nitrogen, 1)
                .color(0x8533e8)
                .build()

        NineOctadecene = new Material.Builder(15173, SuSyUtility.susyId('nine_octadecanone'))
                .fluid()
                .components(Carbon, 18, Hydrogen, 36, Oxygen, 1)
                .colorAverage()
                .build()

        TriOctylDecylAmine = new Material.Builder(15174, SuSyUtility.susyId('tri_octyl_decyl_amine'))
                .fluid()
                .components(Carbon, 54, Hydrogen, 111, Nitrogen, 1)
                .color(0x6776c9)
                .build()

        Diethylbenzene = new Material.Builder(15175, SuSyUtility.susyId('diethylbenzene'))
                .fluid()
                .components(Carbon, 10, Hydrogen, 14)
                .color(0xad9797)
                .build()

        Divinylbenzene = new Material.Builder(15176, SuSyUtility.susyId('divinylbenzene'))
                .fluid()
                .components(Carbon, 10, Hydrogen, 10)
                .color(0xad9797)
                .build()

        NButanol = new Material.Builder(15177, SuSyUtility.susyId('n_butanol'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 1)
                .colorAverage()
                .build()

        DibutylCarbitol = new Material.Builder(15178, SuSyUtility.susyId('dibutyl_carbitol'))
                .fluid()
                .components(Carbon, 12, Hydrogen, 26, Oxygen, 3)
                .color(0x89db6b)
                .build()

        DibutylCarbitol.setFormula('(CH3CH2CH2CH2OCH2CH2)2O', true)

        MonoTwoEthylhexylPhosphoricAcid = new Material.Builder(15179, SuSyUtility.susyId('mono_two_ethylhexyl_phosphoric_acid'))
                .fluid()
                .components(Carbon, 16, Hydrogen, 34, Oxygen, 3, Phosphorus, 1)
                .color(0xb5a677)
                .build()

        MonoTwoEthylhexylPhosphoricAcid.setFormula('(C8H17O)2PO(OH)', true)

        MethylIsobutylKetone = new Material.Builder(15180, SuSyUtility.susyId('methyl_isobutyl_ketone'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 12, Oxygen, 1)
                .color(0x86dbb1)
                .build()

        MethylIsobutylCarbinol = new Material.Builder(15181, SuSyUtility.susyId('methyl_isobutyl_carbinol'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 14, Oxygen, 1)
                .color(0x79c4c7)
                .build()

        NHexanol = new Material.Builder(15182, SuSyUtility.susyId('n_hexanol'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 14, Oxygen, 1)
                .color(0xff9640)
                .build();

        NHexanol.setFormula('C6H13OH', true)

        NDecanol = new Material.Builder(15183, SuSyUtility.susyId('n_decanol'))
                .fluid()
                .components(Carbon, 10, Hydrogen, 22, Oxygen, 1)
                .color(0xdb8035)
                .build();

        NDecanol.setFormula('C10H21OH', true)

        NDodecanol = new Material.Builder(15184, SuSyUtility.susyId('n_dodecanol'))
                .fluid()
                .fluidTemp(298)
                .components(Carbon, 12, Hydrogen, 26, Oxygen, 1)
                .color(0xbd6e2d)
                .build();

        NDodecanol.setFormula('C12H25OH', true)

        NTetradecanol = new Material.Builder(15185, SuSyUtility.susyId('n_tetradecanol'))
                .fluid()
                .fluidTemp(311)
                .components(Carbon, 14, Hydrogen, 30, Oxygen, 1)
                .color(0x2177ff)
                .build();

        NTetradecanol.setFormula('C14H29OH', true)

        NHexadecanol = new Material.Builder(15186, SuSyUtility.susyId('n_hexadecanol'))
                .fluid()
                .fluidTemp(323)
                .components(Carbon, 16, Hydrogen, 34, Oxygen, 1)
                .color(0x824b1e)
                .build();

        NHexadecanol.setFormula('C16H33OH', true)

        OleicAcid = new Material.Builder(15187, SuSyUtility.susyId('oleic_acid'))
                .dust().fluid()
                .components(Carbon, 18, Hydrogen, 34, Oxygen, 2)
                .color(0xb1d1ae)
                .build()

        LinoleicAcid = new Material.Builder(15188, SuSyUtility.susyId('linoleic_acid'))
                .dust().fluid()
                .components(Carbon, 18, Hydrogen, 32, Oxygen, 2)
                .color(0xbfd1a3)
                .build()

        PalmiticAcid = new Material.Builder(15189, SuSyUtility.susyId('palmitic_acid'))
                .dust().fluid()
                .components(Carbon, 16, Hydrogen, 32, Oxygen, 2)
                .color(0xd4d392)
                .build()

        Capsaicin = new Material.Builder(15190, SuSyUtility.susyId('capsaicin'))
                .dust()
                .components(Carbon, 18, Hydrogen, 27, Nitrogen, 1, Oxygen, 3)
                .color(0xff1900)
                .build();

        Diisopropylamine = new Material.Builder(15191, SuSyUtility.susyId('diisopropylamine'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 15, Nitrogen, 1)
                .colorAverage()
                .build();

        Diisopropylaminoethanol = new Material.Builder(15192, SuSyUtility.susyId('diisopropylaminoethanol'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 19, Nitrogen, 1, Oxygen, 1)
                .colorAverage()
                .build();

        IsopropylAlcohol = new Material.Builder(15193, SuSyUtility.susyId('isopropyl_alcohol'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 8, Oxygen, 1)
                .colorAverage()
                .build();

        IsopropylAlcohol.setFormula('(CH3)2CHOH', true)

        Triethylamine = new Material.Builder(15194, SuSyUtility.susyId('triethylamine'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 15, Nitrogen, 1)
                .color(0xe07d26)
                .build();

        Diethylamine = new Material.Builder(15195, SuSyUtility.susyId('diethylamine'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 11, Nitrogen, 1)
                .color(0xf59542)
                .build();

        Ethylamine = new Material.Builder(15196, SuSyUtility.susyId('ethylamine'))
                .fluid()
                .components(Carbon, 2, Hydrogen, 7, Nitrogen, 1)
                .color(0xf5a55f)
                .build();

        Diethylacetamide = new Material.Builder(15197, SuSyUtility.susyId('diethylacetamide'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 13, Oxygen, 1, Nitrogen, 1)
                .colorAverage()
                .build();

        Diethylacetimidamine = new Material.Builder(15198, SuSyUtility.susyId('diethylacetimidamine'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 14, Nitrogen, 2)
                .colorAverage()
                .build();

        Novichok = new Material.Builder(15199, SuSyUtility.susyId('novichok'))
                .fluid()
                .components(Carbon, 7, Hydrogen, 16, Fluorine, 1, Nitrogen, 2, Oxygen, 1, Phosphorus, 1)
                .colorAverage()
                .build();

        IsoamylAlcohol = new Material.Builder(15200, SuSyUtility.susyId('isoamyl_alcohol'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 12, Oxygen, 1)
                .color(0x23ad13)
                .build();

        IsoamylAlcohol.setFormula('(CH3)2CHCH2CH2OH', true)

        IsobutylAlcohol = new Material.Builder(15201, SuSyUtility.susyId('isobutyl_alcohol'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 1)
                .color(0xa0ad13)
                .build();

        IsobutylAlcohol.setFormula('(CH3)2CHCH2OH', true)

        CaprylicAcid = new Material.Builder(15202, SuSyUtility.susyId('caprylic_acid'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 16, Oxygen, 2)
                .color(0x748545)
                .build();

        OctanoylChloride = new Material.Builder(15203, SuSyUtility.susyId('octanoyl_chloride'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 15, Chlorine, 1, Oxygen, 1)
                .color(0x458548)
                .build();

        PerfluorooctanoylFluoride = new Material.Builder(15204, SuSyUtility.susyId('perfluorooctanoyl_fluoride'))
                .fluid()
                .components(Carbon, 8, Fluorine, 16, Oxygen, 1)
                .color(0x288a7b)
                .build();

        PerfluorooctanoicAcid = new Material.Builder(15205, SuSyUtility.susyId('perfluorooctanoic_acid'))
                .dust()
                .components(Carbon, 8, Hydrogen, 1, Fluorine, 15, Oxygen, 2)
                .color(0x24bfa8)
                .build();

        OneButene = new Material.Builder(15206, SuSyUtility.susyId('one_butene'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 4, Hydrogen, 8)
                .color(0xed9595)
                .build();

        TwoButene = new Material.Builder(15207, SuSyUtility.susyId('two_butene'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 4, Hydrogen, 8)
                .color(0xab6009)
                .build();

        NPentanol = new Material.Builder(15208, SuSyUtility.susyId('n_pentanol'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 12, Oxygen, 1)
                .color(0xb37834)
                .build();

        SodiumEthoxideSolution = new Material.Builder(15209, SuSyUtility.susyId('sodium_ethoxide_solution'))
                .fluid()
                .components(Carbon, 2, Hydrogen, 5, Oxygen, 1, Sodium, 1, Ethanol, 1)
                .color(0xcc5050)
                .build();

        SodiumEthoxideSolution.setFormula('(CH3CH2ONa)(H2O)', true)

        SodiumEthylXanthate = new Material.Builder(15210, SuSyUtility.susyId('sodium_ethyl_xanthate'))
                .dust()
                .components(Carbon, 3, Hydrogen, 5, Oxygen, 1, Sulfur, 2, Sodium, 1)
                .color(0xfdffbf)
                .build();

        SodiumEthylXanthate.setFormula('CH3CH2OCS2Na', true)

        PotassiumAmylXanthate = new Material.Builder(15211, SuSyUtility.susyId('potassium_amyl_xanthate'))
                .dust()
                .components(Carbon, 6, Hydrogen, 11, Oxygen, 1, Sulfur, 2, Potassium, 1)
                .color(0xe0d582)
                .build();

        PotassiumAmylXanthate.setFormula('C5H11OCS2K', true)

        Isobutyraldehyde = new Material.Builder(15212, SuSyUtility.susyId('isobutyraldehyde'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 8, Oxygen, 1)
                .color(0x9ccf69)
                .build();

        SodiumIsobutylXanthate = new Material.Builder(15213, SuSyUtility.susyId('sodium_isobutyl_xanthate'))
                .dust()
                .components(Carbon, 5, Hydrogen, 9, Oxygen, 1, Sulfur, 2, Sodium, 1)
                .color(0xb1bf60)
                .build();

        SodiumIsobutylXanthate.setFormula('(CH3)2CHCH2OCS2Na', true)

        PotassiumIsopropylXanthate = new Material.Builder(15214, SuSyUtility.susyId('potassium_isopropyl_xanthate'))
                .dust()
                .components(Carbon, 4, Hydrogen, 7, Oxygen, 1, Sulfur, 2, Potassium, 1)
                .color(0xcbdb6b)
                .build();

        PotassiumIsopropylXanthate.setFormula('(CH3)2CHOCS2K', true)

        PotassiumEthylXanthate = new Material.Builder(15215, SuSyUtility.susyId('potassium_ethyl_xanthate'))
                .dust()
                .components(Carbon, 3, Hydrogen, 5, Oxygen, 1, Sulfur, 2, Potassium, 1)
                .color(0xfdffc8)
                .build();

        PotassiumEthylXanthate.setFormula('CH3CH2OCS2K', true)

        Valeraldehyde = new Material.Builder(15216, SuSyUtility.susyId('valeraldehyde'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 10, Oxygen, 1)
                .color(0xb3af34)
                .build();

        NHexadecylamine = new Material.Builder(15217, SuSyUtility.susyId('n_hexadecylamine'))
                .dust()
                .components(Carbon, 16, Hydrogen, 35, Nitrogen, 1)
                .color(0xcff5ff)
                .build();

        TertButylAlcohol = new Material.Builder(15218, SuSyUtility.susyId('tert_butyl_alcohol'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 10, Oxygen, 1)
                .colorAverage()
                .build();

        TertButylAlcohol.setFormula('(CH3)3COH', true)

        ButylatedHydroxytoluene = new Material.Builder(15219, SuSyUtility.susyId('butylated_hydroxytoluene'))
                .fluid()
                .components(Carbon, 15, Hydrogen, 25, Oxygen, 1)
                .colorAverage()
                .build();

        ButylatedHydroxytoluene.setFormula('((CH3)3C)2CH3C6H2OH', true)

        DimethylTertButylphenol = new Material.Builder(15220, SuSyUtility.susyId('dimethyl_tert_butylphenol'))
                .fluid()
                .components(Carbon, 12, Hydrogen, 18, Oxygen, 1)
                .colorAverage()
                .build();

        DimethylTertButylphenol.setFormula('(CH3)2(CH3)3C7H2OH', true)

        AluminiumPhenolate = new Material.Builder(15221, SuSyUtility.susyId('aluminium_phenolate'))
                .fluid()
                .components(Carbon, 18, Hydrogen, 15, Aluminium, 1, Oxygen, 3)
                .colorAverage()
                .build();

        AluminiumPhenolate.setFormula('Al(OC6H5)3', true)

        DiTertButylphenol = new Material.Builder(15222, SuSyUtility.susyId('di_tert_butylphenol'))
                .fluid()
                .components(Carbon, 14, Hydrogen, 22, Oxygen, 1)
                .colorAverage()
                .build();

        DiTertButylphenol.setFormula('((CH3)3C)2C6H3OH', true)

        IsoOctane = new Material.Builder(15223, SuSyUtility.susyId('isooctane'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 18)
                .colorAverage()
                .build();

        IsoOctane.setFormula('(CH3)3CCH2CH(CH3)2', true)

        PurifiedIsoprene = new Material.Builder(15224, SuSyUtility.susyId('purified_isoprene'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 8)
                .color(0x000000)
                .build();

        Cyclopentadiene = new Material.Builder(15225, SuSyUtility.susyId('cyclopentadiene'))
                .fluid()
                .components(Carbon, 5, Hydrogen, 6)
                .color(0x403c32)
                .build();

        CyclopentadieneSolution = new Material.Builder(15226, SuSyUtility.susyId('cyclopentadiene_solution'))
                .fluid()
                .components(Cyclopentadiene, 1, Benzene, 1)
                .colorAverage()
                .build();

        Ferrocene = new Material.Builder(15227, SuSyUtility.susyId('ferrocene'))
                .dust()
                .components(Carbon, 10, Hydrogen, 10, Iron, 1)
                .color(0x403c32)
                .build();

        Ferrocene.setFormula('Fe(C5H5)2', true)

        Polyisoprene = new Material.Builder(15228, SuSyUtility.susyId('polyisoprene'))
                .dust()
                .iconSet(SHINY)
                .components(Carbon, 5, Hydrogen, 8)
                .color(0x1f1f1f)
                .build();

        Chloroethane = new Material.Builder(15229, SuSyUtility.susyId('chloroethane'))
                .fluid(FluidTypes.GAS)
                .components(Carbon, 2, Hydrogen, 5, Chlorine, 1)
                .colorAverage()
                .build();

        ExtractedCaprolactamSolution = new Material.Builder(15230, SuSyUtility.susyId('extracted_caprolactam_solution'))
                .fluid()
                .components(Caprolactam, 1, Toluene, 1)
                .colorAverage()
                .build();
        
        Trimethylaluminium = new Material.Builder(15231, SuSyUtility.susyId('trimethylaluminium'))
                .fluid()
                .components(Aluminium, 1, Carbon, 3, Hydrogen, 9)
                .color(0x7abfb4)
                .build();

        Trimethylaluminium.setFormula('Al(CH3)3', true)

        Methylaluminoxane = new Material.Builder(15232, SuSyUtility.susyId('methylaluminoxane'))
                .dust()
                .components(Aluminium, 1, Carbon, 1, Hydrogen, 3, Oxygen, 1)
                .color(0x33a391)
                .build();

        ZirconoceneDichloride = new Material.Builder(15233, SuSyUtility.susyId('zirconocene_dichloride'))
                .dust()
                .components(Zirconium, 1, Carbon, 10, Hydrogen, 10, Chlorine, 2)
                .color(0x3ea0a3)
                .build();

        ZirconoceneDichloride.setFormula('Zr(C5H5)2Cl2', true)

        Tetrahydrofuran = new Material.Builder(15234, SuSyUtility.susyId('tetrahydrofuran'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 8, Oxygen, 1)
                .color(0xd13485)
                .build();

        SodiumCyclopentadienide = new Material.Builder(15235, SuSyUtility.susyId('sodium_cyclopentadienide'))
                .dust()
                .components(Sodium, 1, Carbon, 5, Hydrogen, 5)
                .colorAverage()
                .build();
      
        OctylHydroxamicAcid = new Material.Builder(15236, SuSyUtility.susyId('octyl_hydroxamic_acid'))
                .dust()
                .components(Carbon, 8, Hydrogen, 17, Oxygen, 2, Nitrogen, 1)
                .color(0xd47f31)
                .build();

        PotassiumOctylHydroxamate = new Material.Builder(15237, SuSyUtility.susyId('potassium_octyl_hydroxamate'))
                .dust()
                .components(Carbon, 8, Hydrogen, 16, Oxygen, 2, Nitrogen, 1, Potassium, 1)
                .color(0xd47f50)
                .build();

        PotassiumButylXanthate = new Material.Builder(15238, SuSyUtility.susyId('potassium_butyl_xanthate'))
                .dust()
                .components(Carbon, 5, Hydrogen, 9, Oxygen, 1, Sulfur, 2, Potassium, 1)
                .color(0xd1c675)
                .build();

        PotassiumButylXanthate.setFormula('C4H9OCS2K', true)

        PicricAcid = new Material.Builder(15239, SuSyUtility.susyId('picric_acid')) 
                .dust()
                .components(Carbon, 6, Hydrogen, 3, Nitrogen, 3, Oxygen, 7)
                .color(0xc2ba1f)
                .build();

        Monomethylhydrazine = new Material.Builder(15240, SuSyUtility.susyId('monomethylhydrazine'))
                .fluid()
                .components(Carbon, 1, Hydrogen, 6, Nitrogen, 2)
                .color(0x558ca6)
                .build();

        OrthoXylene = new Material.Builder(15241, SuSyUtility.susyId('ortho_xylene'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 10)
                .color(0x3d3427)
                .build();

        MetaXylene = new Material.Builder(15242, SuSyUtility.susyId('meta_xylene'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 10)
                .color(0x40392f)
                .build();

        ParaXylene = new Material.Builder(15243, SuSyUtility.susyId('para_xylene'))
                .dust().fluid()
                .components(Carbon, 8, Hydrogen, 10)
                .color(0x1a1611)
                .build();

        MetaParaXyleneMixture = new Material.Builder(15244, SuSyUtility.susyId('meta_para_xylene_mixture'))
                .fluid()
                .components(Carbon, 8, Hydrogen, 10)
                .color(0x2b2319)
                .build();

        Tripropylamine = new Material.Builder(15245, SuSyUtility.susyId('tripropylamine'))
                .fluid()
                .components(Carbon, 9, Hydrogen, 21, Nitrogen, 1)
                .color(0x90b846)
                .build();

        NBromopropane = new Material.Builder(15246, SuSyUtility.susyId('n_bromopropane'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 7, Bromine, 1)
                .color(0x9e833f)
                .build();
      		
      	Triethylenetetramine = new Material.Builder(15247, SuSyUtility.susyId('triethylenetetramine'))
      		.fluid()
      		.components(Carbon, 6, Hydrogen, 18, Nitrogen, 4)
      		.color(0x3d98ab)
      		.build();
      		
      	Aminoethylpiperazine = new Material.Builder(15248, SuSyUtility.susyId('aminoethylpiperazine'))
      	      	.components(Carbon, 6, Hydrogen, 15, Nitrogen, 3)
      		.fluid()
      		.color(0xcce862)
      		.build();	
    
        Diethylenetriamine = new Material.Builder(15249, SuSyUtility.susyId('diethylenetriamine'))
              	.components(Carbon, 4, Hydrogen, 13, Nitrogen, 3)
      		.fluid()
      		.color(0x0234a8)
      		.build();
    
        Ethylenediamine = new Material.Builder(15250, SuSyUtility.susyId('ethylenediamine'))
              	.components(Carbon, 2, Hydrogen, 8, Nitrogen, 2)
      		.fluid()
      		.color(0x2e7a25)
      		.build();
      		
      	Piperazine = new Material.Builder(15251, SuSyUtility.susyId('piperazine'))
      	      	.components(Carbon, 4, Hydrogen, 10, Nitrogen, 2)
      		.fluid()
      		.color(0x8a8f9f)
      		.build();
      		
      	Cyclooctadiene = new Material.Builder(15253, SuSyUtility.susyId('cyclooctadiene'))
      		.components(Carbon, 8, Hydrogen, 12)
      		.fluid()
      		.color(0x4639ee)
      		.build();
      		
      	TriethylPhosphate = new Material.Builder(15254, SuSyUtility.susyId('triethyl_phosphate'))
      		.components(Carbon, 6, Hydrogen, 15, Oxygen, 4, Phosphorus, 1)
      		.fluid()
      		.color(0x4639ee)
      		.build();
      		
        IsopropenylAcetate = new Material.Builder(15255, SuSyUtility.susyId('isopropenyl_acetate'))
      		.components(Carbon, 5, Hydrogen, 8, Oxygen, 2)
      		.fluid()
      		.color(0x4639ee)
      		.build();
      		
      	Acetylacetone = new Material.Builder(15256, SuSyUtility.susyId('acetylacetone'))
      		.components(Carbon, 5, Hydrogen, 8, Oxygen, 2)
      		.fluid()
      		.color(0x092b30)
      		.build();
      		
        NickelIIBisacetylacetonate = new Material.Builder(15257, SuSyUtility.susyId('nickel_ii_bisacetylacetonate'))
      		.components(Carbon, 10, Hydrogen, 14, Nickel, 1, Oxygen, 4)
      		.dust()
      		.color(0x3e5051)
      		.build();
      	
        NickelIIBisacetylacetonate.setFormula('Ni(acac)2', true)

        BiscyclooctadienenickelZero = new Material.Builder(15258, SuSyUtility.susyId('biscyclooctadienenickel_zero'))
        	.components(Carbon, 16, Hydrogen, 24, Nickel, 1)
        	.dust()
        	.color(0xe0e00d)
        	.build();

        BiscyclooctadienenickelZero.setFormula('Ni(cod)2', true)
        	
        DiethylaluminiumAcetylacetonate = new Material.Builder(15259, SuSyUtility.susyId('diethylaluminium_acetylacetonate'))
        	.components(Aluminium, 1, Carbon, 9, Hydrogen, 17, Oxygen, 2)
                .fluid()
                .color(0x10a37e)
                .build();

        DiethylaluminiumAcetylacetonate.setFormula('(acac)AlEt2', true)

        OxalicAcid = new Material.Builder(15260, SuSyUtility.susyId('oxalic_acid'))
                .components(Hydrogen, 2, Carbon, 2, Oxygen, 4)
                .dust()
                .color(0xb5a7aa)
                .build();

        OneAmidoethylTwoAlkylTwoImidazoline = new Material.Builder(15261, SuSyUtility.susyId('one_amidoethyl_two_alkyl_two_imidazoline'))
                .fluid()
                .color(0x9c3398)
                .build();

        Chlorodiphenylphosphine = new Material.Builder(15262, SuSyUtility.susyId('chlorodiphenylphosphine'))
                .fluid()
                .components(Carbon, 12, Hydrogen, 10, Chlorine, 1, Phosphorus, 1)
                .color(0xd2e080)
                .build();

        DiphenylphosphinoaceticAcid = new Material.Builder(15263, SuSyUtility.susyId('diphenylphosphinoacetic_acid'))
                .fluid()
                .components(Carbon, 14, Hydrogen, 13, Oxygen, 2, Phosphorus, 1)
                .color(0xdeba6d)
                .build();

        OneHexene = new Material.Builder(15264, SuSyUtility.susyId('one_hexene'))
                .fluid()
                .components(Carbon, 6, Hydrogen, 12)
                .color(0xd96c6c)
                .build();

        Tripropylene = new Material.Builder(15265, SuSyUtility.susyId('tripropylene'))
                .fluid()
                .components(Carbon, 9, Hydrogen, 18)
                .color(0xcf5f1f)
                .build();

        Isodecanal = new Material.Builder(15266, SuSyUtility.susyId('isodecanal'))
                .fluid()
                .components(Carbon, 10, Hydrogen, 20, Oxygen, 1)
                .color(0xde8431)
                .build();

        Isodecanol = new Material.Builder(15267, SuSyUtility.susyId('isodecanol'))
                .fluid()
                .components(Carbon, 10, Hydrogen, 22, Oxygen, 1)
                .color(0xeb9546)
                .build();

        Trioctylamine = new Material.Builder(15268, SuSyUtility.susyId('trioctylamine'))
                .fluid()
                .components(Carbon, 24, Hydrogen, 51, Nitrogen, 1)
                .color(0x2274a3)
                .build();

        NButylamine = new Material.Builder(15269, SuSyUtility.susyId('n_butylamine'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 11, Nitrogen, 1)
                .color(0x43576e)
                .build();

        Ethyltoluene = new Material.Builder(15270, SuSyUtility.susyId('ethyltoluene'))
                .fluid()
                .components(Carbon, 9, Hydrogen, 12)
                .color(0x806706)
                .build();

        VinylbenzylChloride = new Material.Builder(15271, SuSyUtility.susyId('vinylbenzyl_chloride'))
                .fluid()
                .components(Carbon, 9, Hydrogen, 9, Chlorine, 1)
                .color(0x8fa32a)
                .build();

        TetrabromobisphenolA = new Material.Builder(15272, SuSyUtility.susyId('tetrabromobisphenol_a'))
                .dust()
                .components(Carbon, 15, Hydrogen, 12, Bromine, 4, Oxygen, 2)
                .color(0x6b3220)
                .build();

        Cyanamide = new Material.Builder(15273, SuSyUtility.susyId('cyanamide'))
                .dust()
                .components(Carbon, 1, Hydrogen, 2, Nitrogen, 2)
                .colorAverage()
                .build();

        Dicyandiamide = new Material.Builder(15274, SuSyUtility.susyId('dicyandiamide'))
                .dust()
                .components(Carbon, 2, Hydrogen, 4, Nitrogen, 4)
                .colorAverage()
                .iconSet(QUARTZ)
                .build();

        TwoMethylimidazole = new Material.Builder(15275, SuSyUtility.susyId('two_methylimidazole'))
                .dust()
                .components(Carbon, 4, Hydrogen, 6, Nitrogen, 2)
                .colorAverage()
                .build();

        FlameRetardantEpoxy = new Material.Builder(15276, SuSyUtility.susyId('flame_retardant_epoxy'))
                .dust().fluid()
                .components(Carbon, 21, Hydrogen, 21, Bromine, 4, Chlorine, 1, Oxygen, 5)
                .color(0xc86b14)
                .build();

        PropyleneChlorohydrin = new Material.Builder(15277, SuSyUtility.susyId('propylene_chlorohydrin'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 7, Chlorine, 1, Oxygen, 1)
                .colorAverage()
                .build();

        PropyleneOxide = new Material.Builder(15278, SuSyUtility.susyId('propylene_oxide'))
                .fluid()
                .components(Carbon, 3, Hydrogen, 6, Oxygen, 1)
                .color(0x9ab522)
                .build();

        PropyleneCarbonate = new Material.Builder(15279, SuSyUtility.susyId('propylene_carbonate'))
                .fluid()
                .components(Carbon, 4, Hydrogen, 6, Oxygen, 3)
                .color(0x5db522)
                .build();

        DiphenylSulfide = new Material.Builder(15280, SuSyUtility.susyId('diphenyl_sulfide'))
                .dust()
                .components(Carbon, 12, Hydrogen, 10, Sulfur, 1)
                .color(0x5e5c0a)
                .build();

        DiphenylSulfoxide = new Material.Builder(15281, SuSyUtility.susyId('diphenyl_sulfoxide'))
                .dust()
                .components(Carbon, 12, Hydrogen, 10, Oxygen, 1, Sulfur, 1)
                .color(0x435e0a)
                .build();

        MethanesulfonicAcid = new Material.Builder(15282, SuSyUtility.susyId('methanesulfonic_acid'))
                .fluid()
                .components(Carbon, 1, Hydrogen, 4, Oxygen, 3, Sulfur, 1)
                .color(0xff6e6e)
                .build();

        TriphenylphosphineOxide = new Material.Builder(15283, SuSyUtility.susyId('triphenylphosphine_oxide'))
                .dust()
                .components(Carbon, 18, Hydrogen, 15, Oxygen, 1, Phosphorus, 1)
                .colorAverage()
                .build();

        TosylicAcidSolution = new Material.Builder(15284, SuSyUtility.susyId("tosylic_acid_solution"))
                .fluid()
                .components(Carbon, 7, Hydrogen, 8, Oxygen, 3, Sulfur, 1, Water, 1)
                .colorAverage()
                .build();

        TosylicAcidSolution.setFormula("(TsOH)(H2O)", true)

        Triphenylphosphine = new Material.Builder(15285, SuSyUtility.susyId('triphenylphosphine'))
                .dust()
                .components(Carbon, 18, Hydrogen, 15, Phosphorus, 1)
                .colorAverage()
                .build();

        TriphenylphosphineDichloride = new Material.Builder(15286, SuSyUtility.susyId('triphenylphosphine_dichloride'))
                .dust()
                .components(Carbon, 18, Hydrogen, 15, Chlorine, 2, Phosphorus, 1)
                .colorAverage()
                .build();

        BistriphenylphosphineiminiumChloride = new Material.Builder(15287, SuSyUtility.susyId('bistriphenylphosphineiminium_chloride'))
                .dust()
                .components(Carbon, 36, Hydrogen, 30, Chlorine, 1, Nitrogen, 1, Phosphorus, 2)
                .colorAverage()
                .build();

        OneOneOneThreeTetrachloropropane = new Material.Builder(15292, SuSyUtility.susyId("one_one_one_three_tetrachloropropane"))
                .fluid()
                .components(Carbon, 3, Hydrogen, 4, Chlorine, 4)
                .color(0xffffb0)
                .build();

        OneOneOneThreeTetrachloropropane.setFormula("C3H4Cl4", true)

        OneOneOneTwoThreePentachloropropane = new Material.Builder(15293, SuSyUtility.susyId("one_one_one_two_three_pentachloropropane"))
                .fluid()
                .components(Carbon, 3, Hydrogen, 3, Chlorine, 5)
                .color(0xf0f0f0)
                .build();

        OneOneOneTwoThreePentachloropropane.setFormula("C3H3Cl5", true)

        OneOneTwoThreeTetrachloropropene = new Material.Builder(15294, SuSyUtility.susyId("one_one_two_three_tetrachloropropene"))
                .fluid()
                .components(Carbon, 3, Hydrogen, 2, Chlorine, 4)
                .color(0xfafafa)
                .build();

        OneOneTwoThreeTetrachloropropene.setFormula("C3H2Cl4", true)

        CarbonylSulfide = new Material.Builder(15295, SuSyUtility.susyId('carbonyl_sulfide'))
                .fluid()
                .components(Carbon, 1, Oxygen, 1, Sulfur, 1)
                .color(0xe6e6e6)
                .build()

        Triallate = new Material.Builder(15296, SuSyUtility.susyId('triallate'))
                .fluid()
                .components(Carbon, 10, Hydrogen, 16, Chlorine, 3, Nitrogen, 1, Oxygen, 1, Sulfur, 1)
                .color(0xffbf00)
                .build()

        Triallate.setFormula('C10H16Cl3NOS', true)
    }
}
