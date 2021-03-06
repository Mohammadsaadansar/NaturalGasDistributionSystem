
// Class associated to the NaturalGas schema
package NaturalGasTrading.ontology;

import jade.content.Concept;
import jade.util.leap.List;

public class NaturalGas implements Concept {
private String title;
private List company;
private String sponsors;

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public List getAuthors() {
return company;
}

public void setAuthors(List company) {
this.company = company;
}

public String getEditor() {
return sponsors;
}

public void setEditor(String sponsors) {
this.sponsors = sponsors;
}
}