package com.chrisbees;

import java.util.List;

public class HepatitisB extends Ailments {
    @Override
    public String toString() {
        return "HepatitisB";
    }

    @Override
    public void about_Ailment() {
        super.about_Ailment();
        System.out.println("Hepatitis B:\n: Hepatitis is an inflammation of the liver. The condition can be self-limiting or can progress to fibrosis (scarring), cirrhosis or liver cancer. Hepatitis viruses are the most common cause of hepatitis in the world but other infections, toxic substances (e.g. alcohol, certain drugs), and autoimmune diseases can also cause hepatitis.\n" +
                "\n" +
                "There are 5 main hepatitis viruses, referred to as types A, B, C, D and E. These 5 types are of greatest concern because of the burden of illness and death they cause and the potential for outbreaks and epidemic spread. In particular, types B and C lead to chronic disease in hundreds of millions of people and, together, are the most common cause of liver cirrhosis and cancer.\n" +
                "\n" +
                "Hepatitis A and E are typically caused by ingestion of contaminated food or water. Hepatitis B, C and D usually occur as a result of parenteral contact with infected body fluids. Common modes of transmission for these viruses include receipt of contaminated blood or blood products, invasive medical procedures using contaminated equipment and for hepatitis B transmission from mother to baby at birth, from family member to child, and also by sexual contact.\n" +
                "\n" +
                "Acute infection may occur with limited or no symptoms, or may include symptoms such as jaundice (yellowing of the skin and eyes), dark urine, extreme fatigue, nausea, vomiting and abdominal pain.\n" +
                "\n" +
                "Q: What are the different hepatitis viruses?\n" +
                "\n" +
                "A: Scientists have identified 5 unique hepatitis viruses, identified by the letters A, B, C, D, and E. While all cause liver disease, they vary in important ways.\n" +
                "\n" +
                "Hepatitis A virus (HAV) is present in the faeces of infected persons and is most often transmitted through consumption of contaminated water or food. Certain sex practices can also spread HAV. Infections are in many cases mild, with most people making a full recovery and remaining immune from further HAV infections. However, HAV infections can also be severe and life threatening. Most people in areas of the world with poor sanitation have been infected with this virus. Safe and effective vaccines are available to prevent HAV.\n" +
                "\n" +
                "Hepatitis B virus (HBV) is transmitted through exposure to infective blood, semen, and other body fluids. HBV can be transmitted from infected mothers to infants at the time of birth or from family member to infant in early childhood. Transmission may also occur through transfusions of HBV-contaminated blood and blood products, contaminated injections during medical procedures, and through injection drug use. HBV also poses a risk to healthcare workers who sustain accidental needle stick injuries while caring for infected-HBV patients. Safe and effective vaccines are available to prevent HBV.\n" +
                "\n" +
                "Hepatitis C virus (HCV) is mostly transmitted through exposure to infective blood. This may happen through transfusions of HCV-contaminated blood and blood products, contaminated injections during medical procedures, and through injection drug use. Sexual transmission is also possible, but is much less common. There is no vaccine for HCV.\n" +
                "\n" +
                "Hepatitis D virus (HDV) infections occur only in those who are infected with HBV. The dual infection of HDV and HBV can result in a more serious disease and worse outcome. Hepatitis B vaccines provide protection from HDV infection.\n" +
                "\n" +
                "Hepatitis E virus (HEV) is mostly transmitted through consumption of contaminated water or food. HEV is a common cause of hepatitis outbreaks in developing parts of the world and is increasingly recognized as an important cause of disease in developed countries. Safe and effective vaccines to prevent HEV infection hCommon symptoms of hepatitis\n" +
                "\n" +
                "If you have infectious forms of hepatitis that are chronic, like hepatitis B and C, you may not have symptoms in the beginning. Symptoms may not occur until the damage affects liver function.\n");
    }

    @Override
    public void symptoms() {
        super.symptoms();
        System.out.println("\n");
        System.out.println("Symptoms\nfatigue\n" +
                "flu-like symptoms\n" +
                "dark urine\n" +
                "pale stool\n" +
                "abdominal pain\n" +
                "loss of appetite\n" +
                "unexplained weight loss\n");
    }

    @Override
    public void prescriptions() {
        super.prescriptions();
        System.out.println("\n");
        System.out.println("Prescribed Drugs:\nOral Antivirals \n" +
                "\n" +
                "Tenofovir disoproxil (Viread) is a pill taken once a day, with few side effects, for at least one year or longer. This is considered a first-line treatment with an excellent resistance profile. (Approved in 2008)\n" +
                "Tenofovir alafenamide (Vemlidy) is a pill taken once a day, with few side effects, for at least one year or longer. This is considered a first-line treatment with an excellent resistance profile. (Approved in 2016)\n" +
                "Entecavir (Baraclude) is a pill taken once a day, with few side effects, for at least one year or longer. This is considered a first-line treatment with an excellent resistance profile. (Approved in 2005)\n" +
                "Telbivudine (Tyzeka or Sebivo) is a pill taken once a day, with few side effects, for at least one year or longer. This is considered a second-line treatment option. (Approved in 2006)\n" +
                "Adefovir Dipivoxil (Hepsera) is a pill taken once a day, with few side effects, for at least one year or longer. This is considered a second-line treatment option and patients must have their kidney function monitored regularly. (Approved in 2002)\n" +
                "Lamivudine (Epivir-HBV, Zeffix, or Heptodin) is a pill that is taken once a day, with few side effects, for at least one year or longer. This is generally not used in the U.S. because it is less potent than the newer drugs and most people develop drug resistance within a year or two. (Approved in 1998)\n" +
                "Immune Modulators (Interferons)\n" +
                "\n" +
                "Pegylated Interferon (Pegasys) is given by injection once a week usually for 6 months  to  1 year. The drug can cause side effects such as flu-like symptoms and depression. (Approved in 2005)\n" +
                "Interferon Alpha (Intron A) is given by injection several times a week usually for 6 months to 1 year, but treatment can be longer. The drug can cause side effects such as flu-like symptoms, depression, and headaches.\n");
    }

    @Override
    public void dosage1_10() {
        super.dosage1_10();
        System.out.println("\n");
        System.out.println("Dosage for age 1-10 years\nBirth to 10 years: 4 doses (10 mcg each), IM, on a 0, 1, 2, and 12 month schedule");
    }

    @Override
    public void dosage11_20() {
        System.out.println("\n");
        super.dosage11_20();
        System.out.println("Dosage for age 11-20 years\n5 to 16 years: 3 doses (10 mcg each), IM, on a 0, 12, and 24 month schedule");
    }

    @Override
    public void dosage21_Above() {
        super.dosage21_Above();
        System.out.println("\n");
        System.out.println("Dosage for age 21 and Above\nto 21 years: 3 doses (20 mcg each), IM, on a 0, 1, and 6 month schedule");
    }
}
