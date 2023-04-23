package first;

public class Rim {
    String strResult;
    String rimResult;
    String rimSotny = "";
    String rimDesyatki = "";
    String rimEdinici = "";

    void arabicToRim(int vhod) {

        strResult = Integer.toString(vhod);
        char[] charResult = strResult.toCharArray();


        if (charResult.length == 3) {
            rimSotny = "C";
            rimDesyatki = "";
            rimEdinici = "";
        } else if (charResult.length == 2) {
            switch (charResult[0]) {
                case '1':
                    rimSotny = "";
                    rimDesyatki = "X";
                    break;
                case '2':
                    rimSotny = "";
                    rimDesyatki = "XX";
                    break;
                case '3':
                    rimSotny = "";
                    rimDesyatki = "XXX";
                    break;
                case '4':
                    rimSotny = "";
                    rimDesyatki = "XL";
                    break;
                case '5':
                    rimSotny = "";
                    rimDesyatki = "L";
                    break;
                case '6':
                    rimSotny = "";
                    rimDesyatki = "LX";
                    break;
                case '7':
                    rimSotny = "";
                    rimDesyatki = "LXX";
                    break;
                case '8':
                    rimSotny = "";
                    rimDesyatki = "LXXX";
                    break;
                case '9':
                    rimSotny = "";
                    rimDesyatki = "XC";
                    break;
            }
            switch (charResult[1]) {
                case '0':
                    rimEdinici = "";
                    break;
                case '1':
                    rimEdinici = "I";
                    break;
                case '2':
                    rimEdinici = "II";
                    break;
                case '3':
                    rimEdinici = "III";
                    break;
                case '4':
                    rimEdinici = "IV";
                    break;
                case '5':
                    rimEdinici = "V";
                    break;
                case '6':
                    rimEdinici = "VI";
                    break;
                case '7':
                    rimEdinici = "VII";
                    break;
                case '8':
                    rimEdinici = "VIII";
                    break;
                case '9':
                    rimEdinici = "IX";
                    break;
            }
        } else if (charResult.length == 1) {
            switch (charResult[0]) {
                case '0':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "";
                    break;
                case '1':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "I";
                    break;
                case '2':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "II";
                    break;
                case '3':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "III";
                    break;
                case '4':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "IV";
                    break;
                case '5':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "V";
                    break;
                case '6':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "VI";
                    break;
                case '7':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "VII";
                    break;
                case '8':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "VIII";
                    break;
                case '9':
                    rimSotny = "";
                    rimDesyatki = "";
                    rimEdinici = "IX";
                    break;
            }
        }
        rimResult = rimSotny + rimDesyatki + rimEdinici;
        System.out.println(rimResult);
    }
}
