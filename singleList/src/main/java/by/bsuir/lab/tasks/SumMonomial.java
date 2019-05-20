package by.bsuir.lab.tasks;

import by.bsuir.lab.common.Monomial;
import by.bsuir.lab.common.Operator;
import by.bsuir.lab.list.LinkedList;

public class SumMonomial {

    public LinkedList<Monomial> sum(LinkedList<?> f, LinkedList<?> s) {

        LinkedList<Monomial> fMonomial = (LinkedList<Monomial>) f;
        LinkedList<Monomial> sMonomial = (LinkedList<Monomial>) s;
        int fSize = fMonomial.size();

        for (int i = 0; i < fSize; i++) {
            int sSize = sMonomial.size();
            for (int j = 0; j < sSize; j++) {

                if ((fMonomial.get(i).getParameter() == null && sMonomial.get(j).getParameter() == null)) {

                    fMonomial.get(i).setKoefficient(fMonomial.get(i).getKoefficient() + sMonomial.get(j).getKoefficient());
                    sMonomial.remove(sMonomial.get(j));

                    break;
                }
                if ((fMonomial.get(i).getParameter() != null && sMonomial.get(j).getParameter() != null)) {
                    if (fMonomial.get(i).getParameter().equals(sMonomial.get(j).getParameter()) &&
                            fMonomial.get(i).getPower() == sMonomial.get(j).getPower()) {
                    	
                        fMonomial.get(i).setKoefficient(fMonomial.get(i).getKoefficient() + sMonomial.get(j).getKoefficient());
                        sMonomial.remove(sMonomial.get(j));
                        
                        break;
                    }
                }
            }
        }
        if (sMonomial != null) {
        	fMonomial.addAll(sMonomial);
        }
        return fMonomial;
    }

    public String formatter(LinkedList<Monomial> monomialList) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < monomialList.size(); i++) {

            Monomial m = monomialList.get(i);

            sb.append(
                        (m.getOperator().equals(Operator.PLUS) ? "+" : "-")
                        + m.getKoefficient() + (m.getParameter() == null ? "" : m.getParameter())
                        + (m.getPower() == 0 || m.getPower() == 1 ? "" : ("^" + m.getPower())));

        }

        return sb.toString();
    }

}
