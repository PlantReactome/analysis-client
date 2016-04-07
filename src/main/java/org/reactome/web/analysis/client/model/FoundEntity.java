package org.reactome.web.analysis.client.model;

import java.util.Set;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface FoundEntity extends IdentifierSummary {

    Set<IdentifierMap> getMapsTo();
}
