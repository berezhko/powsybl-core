/**
 * Copyright (c) 2016, All partners of the iTesla project (http://www.itesla-project.eu/consortium)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package cim1.model;

import cim1.exc.InterpretationException;
import cim1.exc.LinkageException;
import java.util.BitSet;
import java.util.Map;
import java.util.EnumMap;
import javax.xml.stream.XMLStreamException;
import cim1.CIMURI;
import javax.xml.stream.XMLStreamWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * This file has been automatically generated by CIMGateway
 *
 * Description :
 *
 * This class "OperationalLimit.java" represents the
 * class OperationalLimit extends IdentifiedObject
 *    + OperationalLimitSet   1..1   OperationalLimitSet 
 *    + OperationalLimitType   1..1   OperationalLimitType 

 */
public class OperationalLimit extends IdentifiedObject {

    private static Logger LOGGER = LoggerFactory.getLogger(OperationalLimit.class);

    /**
     * Attribute "operationalLimitSet"
     *
     * Comment from profile:
     * The limit set to which the limit values belong.
     */
    public OperationalLimitSet operationalLimitSet;

    /**
     * The id of the attribute "operationalLimitSet"
     * This id is mainly used to resolve links after parsing an instance
     */

    public String idOperationalLimitSet;

    /**
     * Attribute "operationalLimitType"
     *
     * Comment from profile:
     * The limit type associated with this limit.
     */
    public OperationalLimitType operationalLimitType;

    /**
     * The id of the attribute "operationalLimitType"
     * This id is mainly used to resolve links after parsing an instance
     */

    public String idOperationalLimitType;

    /**
     * The current bitset describing the state of each CIM attribute of this
     * class
     */
    private BitSet currentBitset = new BitSet();

   /**
    * The bitset describing which CIM attributes of this class have to set to
    * be consistent within a "merged" context
    */
    private final BitSet minBitset = new BitSet();

   /**
    * The Map of subset<=>bitset describing which CIM attributes of this class
    * have to set to be consistent within a specific subset context
    */
    private final Map<Subset, BitSet> minBitsets
            = new EnumMap<Subset, BitSet>(Subset.class);

    
    /**
     * Utility to return the "operationalLimitSet"
     *
     * @return the value of the attribute "operationalLimitSet"
     */
    public OperationalLimitSet getOperationalLimitSet() {
        return this.operationalLimitSet;
    }

    /**
     * Utility to test if the value of "operationalLimitSet" has been set
     *
     * @return boolean
     *            if true the attribute "operationalLimitSet" is already set
     *            if false it isn't yet
     */
    public boolean operationalLimitSetIsSet() {
        return this.currentBitset.get(0);
    }

    /**
     * Utility to set the "operationalLimitSetValue"
     *
     * @param operationalLimitSetValue
     *            instance to set
     * @param setInverse
     *            boolean to specify whether to set the inverse association
     *            or not
     * @throws LinkageException
     */
    public void setOperationalLimitSet(
            OperationalLimitSet operationalLimitSetValue,
            boolean setInverse) throws LinkageException {
        this.operationalLimitSet = operationalLimitSetValue;
        this.currentBitset.set(0);
        if (setInverse) {
            
            if (operationalLimitSetValue != null) {
                operationalLimitSetValue.addOperationalLimitValue(this, false);
            }
        }
    }
    
    /**
     * Utility to return the "operationalLimitType"
     *
     * @return the value of the attribute "operationalLimitType"
     */
    public OperationalLimitType getOperationalLimitType() {
        return this.operationalLimitType;
    }

    /**
     * Utility to test if the value of "operationalLimitType" has been set
     *
     * @return boolean
     *            if true the attribute "operationalLimitType" is already set
     *            if false it isn't yet
     */
    public boolean operationalLimitTypeIsSet() {
        return this.currentBitset.get(1);
    }

    /**
     * Utility to set the "operationalLimitTypeValue"
     *
     * @param operationalLimitTypeValue
     *            instance to set
     * @param setInverse
     *            boolean to specify whether to set the inverse association
     *            or not
     * @throws LinkageException
     */
    public void setOperationalLimitType(
            OperationalLimitType operationalLimitTypeValue,
            boolean setInverse) throws LinkageException {
        this.operationalLimitType = operationalLimitTypeValue;
        this.currentBitset.set(1);
        if (setInverse) {
            
            if (operationalLimitTypeValue != null) {
                operationalLimitTypeValue.addOperationalLimit(this, false);
            }
        }
    }


    /**
     * Factory of the class
     *
     * @param id
     *            id of the class OperationalLimit to create
     * @return the class created
     */
    public static OperationalLimit create(final String id) {
        OperationalLimit newOperationalLimit = new OperationalLimit();
        newOperationalLimit.setId(id);
        return newOperationalLimit;
    }

    /**
     * Utility to "clear" the content of a class when a subset is invalidated
     *
     * @param subset subset to clean
     */
    @Override
    public void clearContent(Subset subset) {

        // First of all, we clear the associations:
        this.clearAssociations(subset);


        // The function has been called by a concrete class :
        // the checking has already been done so we can clear everything !


        super.clearContent(subset);
    }

    /**
     * Utility to read an attribute
     * This function is called by the CIMModel
     *
     * @param class_name
     *            the read name of class
     * @param attr_name
     *            the read name of attribute
     * @param value
     *            the read value of the attribute
     * @param model
     *            the interface to the model this class belongs to
     * @throws InterpretationException
     */
    @Override
    public void readAttribute(final String class_name, final String attr_name,
                              final String value, CIMModel model) throws InterpretationException {

        if (class_name.equals("OperationalLimit")) {
            StringBuilder errorMessage = new StringBuilder("The attribute \"");
            errorMessage.append(attr_name);
            errorMessage.append("\" in class \"");
            errorMessage.append(class_name);
            errorMessage.append("\" could not be found in the model !");
            throw new InterpretationException(errorMessage.toString());
        } else {
            super.readAttribute(class_name, attr_name, value, model);
        }
    }

    /**
     * Utility to read a reference to a resource
     * This function is called by the CIMModel
     *
     * @param class_name
     *            the read name of class
     * @param resource_name
     *            the read name of the associated resource
     * @param id
     *            the id of the associated resource
     * @param model
     *            the model this class belongs to
     * @throws InterpretationException
     */
    @Override
    public void readResource(final String class_name,
            final String resource_name, final String id, CIMModel model)
            throws InterpretationException, LinkageException {
        if (class_name.equals("OperationalLimit")) {
        if (resource_name.equals("OperationalLimitSet")) {
            idOperationalLimitSet = id.substring(1);

            if (!super.isAddedToUnresolved()) {
                model.addUnresolved();
                super.addToUnresolved();
            }
        }
        if (resource_name.equals("OperationalLimitType")) {
            idOperationalLimitType = id.substring(1);

            if (!super.isAddedToUnresolved()) {
                model.addUnresolved();
                super.addToUnresolved();
            }
        }
        } else {
            super.readResource(class_name, resource_name, id, model);
        }
    }

    /**
     * Utility to write the content into the CIM XML format
     *
     * @param writeID
     *            specifies whether to write the XML "id" attribute (this is used for describing concrete class)
     * @param xmlsw
     *            XMLStreamWriter where are stored the elements to write
     */
    @Override
    public void write(XMLStreamWriter xmlsw, boolean writeID) {

        /*
         * In previous versions, we used to check the consistency
         * of the instance in the context but this task is now
         * performed by the model before attempting to write.
         * Therefore each instance can now be written even if
         * it is not consistent !
         */

        writeClass(xmlsw);
        super.write(xmlsw, false);
        return;
    }

    /**
     * Utility to write the content this class into the CIM/XML format according
     * to a subset
     *
     * @param subset
     *            the subset defining the context in which to write this class
     * @param writeID
     *            specifies whether to write the XML "id" attribute (this is used for describing concrete class)
     * @param xmlsw
     *            the stream in which are stored the elements to write
     */
    @Override
    public void write(XMLStreamWriter xmlsw, final Subset subset,
            boolean writeID) {

        /*
         * In previous versions, we used to check the consistency
         * of the instance in the context but this task is now
         * performed by the model before attempting to write.
         * Therefore each instance can now be written even if
         * it is not consistent !
         */

        // abstract class
        writeClass(xmlsw);
        super.write(xmlsw, subset, false);
        return;
    }

    /**
     * Utility to resolve the links at the end of parsing
     *
     * @param model
     *            the model this class belongs to
     * @param boundaryModel
     *            the model that gather data about the boundarySet, used
     *            as a resource force links resolving
     * @throws Linkage Exception
     */
    @Override
    public void resolveLinks(CIMModel model, CIMModel boundaryModel) throws LinkageException {
        if (idOperationalLimitSet != null) {
            OperationalLimitSet attributeToSet =
                    model.searchOperationalLimitSet
                    (idOperationalLimitSet);

            if (attributeToSet != null) {
                boolean setInverse = true;

                try {
                    this.setOperationalLimitSet(attributeToSet, setInverse);
                } catch(LinkageException e) {
                   LOGGER.error(e.toString(), e);
                    throw new LinkageException(e.getMessage());
                }
            } else if (boundaryModel != null) {
                OperationalLimitSet attributeToSetFromBoundary = boundaryModel.searchOperationalLimitSet(idOperationalLimitSet);
                if(attributeToSetFromBoundary != null) {
                    attributeToSetFromBoundary.setFromBoundary(true);
                    try {
                        model.createOperationalLimitSet(idOperationalLimitSet, attributeToSetFromBoundary);
                    } catch (InterpretationException e) {
                       LOGGER.error(e.toString(), e);
                    }
                    boolean setInverse = true;
                    try {
                        this.setOperationalLimitSet(attributeToSetFromBoundary, setInverse);
                    } catch(LinkageException e) {
                       LOGGER.error(e.toString(), e);
                        throw new LinkageException(e.getMessage());
                    }
                    attributeToSetFromBoundary.resolveLinks(model, boundaryModel);
                } else {
                    StringBuilder errorMessage = new StringBuilder(
                            "Could not find the reference to object of type \"OperationalLimitSet\" and id \"");
                    errorMessage.append(idOperationalLimitSet);
                    errorMessage.append("\" in \"OperationalLimit\" of id \"");
                    errorMessage.append(this.getId());
                    errorMessage.append("\" !");
                    throw new LinkageException(errorMessage.toString());
                }
            } else {
                StringBuilder errorMessage = new StringBuilder(
                        "Could not find the reference to object of type \"OperationalLimitSet\" and id \"");
                errorMessage.append(idOperationalLimitSet);
                errorMessage.append("\" in \"OperationalLimit\" of id \"");
                errorMessage.append(this.getId());
                errorMessage.append("\" !");
                throw new LinkageException(errorMessage.toString());
            }
        }


        if (idOperationalLimitType != null) {
            OperationalLimitType attributeToSet =
                    model.searchOperationalLimitType
                    (idOperationalLimitType);

            if (attributeToSet != null) {
                boolean setInverse = true;

                try {
                    this.setOperationalLimitType(attributeToSet, setInverse);
                } catch(LinkageException e) {
                   LOGGER.error(e.toString(), e);
                    throw new LinkageException(e.getMessage());
                }
            } else if (boundaryModel != null) {
                OperationalLimitType attributeToSetFromBoundary = boundaryModel.searchOperationalLimitType(idOperationalLimitType);
                if(attributeToSetFromBoundary != null) {
                    attributeToSetFromBoundary.setFromBoundary(true);
                    try {
                        model.createOperationalLimitType(idOperationalLimitType, attributeToSetFromBoundary);
                    } catch (InterpretationException e) {
                       LOGGER.error(e.toString(), e);
                    }
                    boolean setInverse = true;
                    try {
                        this.setOperationalLimitType(attributeToSetFromBoundary, setInverse);
                    } catch(LinkageException e) {
                       LOGGER.error(e.toString(), e);
                        throw new LinkageException(e.getMessage());
                    }
                    attributeToSetFromBoundary.resolveLinks(model, boundaryModel);
                } else {
                    StringBuilder errorMessage = new StringBuilder(
                            "Could not find the reference to object of type \"OperationalLimitType\" and id \"");
                    errorMessage.append(idOperationalLimitType);
                    errorMessage.append("\" in \"OperationalLimit\" of id \"");
                    errorMessage.append(this.getId());
                    errorMessage.append("\" !");
                    throw new LinkageException(errorMessage.toString());
                }
            } else {
                StringBuilder errorMessage = new StringBuilder(
                        "Could not find the reference to object of type \"OperationalLimitType\" and id \"");
                errorMessage.append(idOperationalLimitType);
                errorMessage.append("\" in \"OperationalLimit\" of id \"");
                errorMessage.append(this.getId());
                errorMessage.append("\" !");
                throw new LinkageException(errorMessage.toString());
            }
        }


        super.resolveLinks(model, boundaryModel);
        removeFromUnresolved();
    }

    /**
     * Utility to check whether this class is consistent according to a subset
     *
     * @param subset
     *            the subset defining the context in which to check whether this class is consistent
     * @return a ConsistencyCheck instance whose boolean attribute (consistent)
     *         indicates if this class is consistent and whose String attribute
     *         (message)
     *         indicates why this class is not consistent if it is not
     */
    @Override
    public ConsistencyCheck modelConsistency(final Subset subset) {
        BitSet intersection = new BitSet(this.minBitsets.get(subset).length());
        intersection.or(this.minBitsets.get(subset));
        // we create a copy of minBitsets.get(subset)
        intersection.and(this.currentBitset);
        boolean consistent = (this.minBitsets.get(subset).equals(intersection));
        StringBuilder message = new StringBuilder("");

        if (!consistent) {
            message.append(getMessageForConsistency(this.minBitsets.get(subset)));
        }
        // consistent = (super.modelConsistency().getLeft()) ? (consistent &&
        // (true)):(consistent && (false))
        // message.append((super.modelConsistency(subset)).getRight());

        if (super.modelConsistency().isConsistent()) {
            consistent = consistent && (true);
            message.append((super.modelConsistency(subset)).getMessage());
        } else {
            consistent = consistent && (false);
            message.append((super.modelConsistency(subset)).getMessage());
        }

        return new ConsistencyCheck(consistent, message.toString());
    }

    /**
     * Utility to check whether this class is consistent in a "merged" context
     *
     * @return a ConsistencyCheck instance whose boolean attribute (consistent)
     *         indicates if this class is consistent and whose String attribute
     *         (message)
     *         indicates why this class is not consistent if it is not
     */
    @Override
    public ConsistencyCheck modelConsistency() {
        BitSet intersection = new BitSet(this.minBitset.length());
        intersection.or(this.minBitset);
        // we create a copy of minBitSet
        intersection.and(this.currentBitset);
        boolean consistent = (this.minBitset.equals(intersection));
        StringBuilder message = new StringBuilder("");

        if (!consistent) {
        message.append(getMessageForConsistency(this.minBitset));
        }
        // consistent = (super.modelConsistency().getLeft()) ? (consistent &&
        // (true)):(consistent && (false))
        // message += (super.modelConsistency(subset)).getRight();

        if (super.modelConsistency().isConsistent()) {
            consistent = consistent && (true);
            message.append((super.modelConsistency()).getMessage());
        } else {
            consistent = consistent && (false);
            message.append((super.modelConsistency()).getMessage());
        }

        return new ConsistencyCheck(consistent, message.toString());
    }

    /**
     * Utility to copy the "base" of an other instance of the same class
     * This utility does not copy the associations with other instances from
     * the instance to copy
     *
     * @param otherOperationalLimit
     *            the instance to copy
     */
    public void copyBase(final OperationalLimit otherOperationalLimit) {


        // Memory allocation has done successfully !
        // Dropping "old" objects...
        // This part may change : we do nothing to allow the user to access
        // object by their id from the global model.

        if (otherOperationalLimit.currentBitset.get(0)) {
            OperationalLimitSet operationalLimitSetAssociation = otherOperationalLimit.getOperationalLimitSet();

            //this.idOperationalLimitSet = (operationalLimitSetAssociation != null) ? operationalLimitSetAssociation.getId() : "";
            if (operationalLimitSetAssociation != null) {
                this.idOperationalLimitSet = operationalLimitSetAssociation.getId();
                // the proper bit will be set when the setter is called
            } else {
                this.idOperationalLimitSet = "";
            }
        }

        if (otherOperationalLimit.currentBitset.get(1)) {
            OperationalLimitType operationalLimitTypeAssociation = otherOperationalLimit.getOperationalLimitType();

            //this.idOperationalLimitType = (operationalLimitTypeAssociation != null) ? operationalLimitTypeAssociation.getId() : "";
            if (operationalLimitTypeAssociation != null) {
                this.idOperationalLimitType = operationalLimitTypeAssociation.getId();
                // the proper bit will be set when the setter is called
            } else {
                this.idOperationalLimitType = "";
            }
        }

        // TODO : Call the parent copy constructor instead ?
        super.copyBase(otherOperationalLimit);

    }

    /**
     * Utility to return the content of this class into the CIM XML format
     *
     * @param xmlsw
     *            the stream in which are stored the elements to write
     */
    private void writeClass(XMLStreamWriter xmlsw) {

        if (currentBitset.get(0)) {
        if (idOperationalLimitSet != null) {
            try {
                // xmlsw.writeCharacters("\t");
                xmlsw.writeEmptyElement(CIMURI.CIMURI,
                        "OperationalLimit.OperationalLimitSet");
                xmlsw.writeAttribute(CIMModel.rdfURI, "resource", "#"
                        + idOperationalLimitSet);
                // xmlsw.writeCharacters("\n");
            } catch(XMLStreamException e) {
                StringBuilder errorMessage = new StringBuilder(
                        "Error while trying to write the resource attribute ");
                errorMessage.append("OperationalLimitSet");
                errorMessage.append(" in class ");
                errorMessage.append("OperationalLimit ");
                errorMessage.append("which ID has been initialized to : ");
                errorMessage.append(getId());
                LOGGER.error(errorMessage.toString());
                LOGGER.error(e.toString(), e);
            }
        }
        }

        if (currentBitset.get(1)) {
        if (idOperationalLimitType != null) {
            try {
                // xmlsw.writeCharacters("\t");
                xmlsw.writeEmptyElement(CIMURI.CIMURI,
                        "OperationalLimit.OperationalLimitType");
                xmlsw.writeAttribute(CIMModel.rdfURI, "resource", "#"
                        + idOperationalLimitType);
                // xmlsw.writeCharacters("\n");
            } catch(XMLStreamException e) {
                StringBuilder errorMessage = new StringBuilder(
                        "Error while trying to write the resource attribute ");
                errorMessage.append("OperationalLimitType");
                errorMessage.append(" in class ");
                errorMessage.append("OperationalLimit ");
                errorMessage.append("which ID has been initialized to : ");
                errorMessage.append(getId());
                LOGGER.error(errorMessage.toString());
                LOGGER.error(e.toString(), e);
            }
        }
        }

        return;
    }

    /**
     * Utility in charge of creating the message when the class is not
     * consistent within a specific context
     *
     * @param minBitset
     *            bitset describing which CIM attributes of this class have
     *            to be set so that it is consistent within a
     *            specific subset context
     * @return the message explaining what is not consistent
     */
    private String getMessageForConsistency(final BitSet minBitset) {

        StringBuilder message = new StringBuilder(
                "Instance of \"OperationalLimit\" of id \"");
        message.append(this.getId());
        message.append("\" is not consistent in this context:\n");
        /*
         * XOR and then AND
         * The result is :
         * "1" : has not been set and need to be
         * "0" : has been set or is not mandatory
         */

        BitSet isNotSet = new BitSet(minBitset.length());
        isNotSet.or(minBitset);
        // we create a copy of minBitset
        isNotSet.xor(this.currentBitset);
        isNotSet.and(minBitset);

        if (isNotSet.get(0)) {
            message.append("\t\"OperationalLimitSet\" needs to be set\n");
        }

        if (isNotSet.get(1)) {
            message.append("\t\"OperationalLimitType\" needs to be set\n");
        }
        return message.toString();
    }

    /**
     * Copy constructor
     * The associations with other objects are not copied
     *
     * @param OperationalLimit
     *            the reference to the class to copy
     * @return the class constructed
     */
    private OperationalLimit(final OperationalLimit otherOperationalLimit) {
        // TODO : check exception safe
        this.copyBase(otherOperationalLimit);
    }

   /**
    * Constructor of the class OperationalLimit
    */
    protected OperationalLimit() {

         // This class is not "concrete" : it is not supposed to be instanciated directly
         // subset is not set : it will be set by subclass
        // attribute "OperationalLimitSet" is mandatory :
        this.minBitset.set(0);
        // attribute "OperationalLimitType" is mandatory :
        this.minBitset.set(1);
        // every subset has the same minsubset :
        this.minBitsets.put(Subset.StateVariables, this.minBitset);
        // every subset has the same minsubset :
        this.minBitsets.put(Subset.Topology, this.minBitset);
        // every subset has the same minsubset :
        this.minBitsets.put(Subset.Equipment, this.minBitset);
    }



    /**
     * Utility to clear the associations of this class belonging to a
     * specific subset
     *
     * @param subset
     *            the subset from which to clear the associations of this class
     */
    @Override
    protected void clearAssociations(final Subset subset) {

        switch (subset) {
            case StateVariables: {
                super.clearAssociations(subset);
                break;
            }
            case Topology: {
                super.clearAssociations(subset);
                break;
            }
            case Equipment: {
                // reset the Reference
                operationalLimitSet = null;
                idOperationalLimitSet = "";
                this.currentBitset.clear(0);
                // reset the Reference
                operationalLimitType = null;
                idOperationalLimitType = "";
                this.currentBitset.clear(1);
                super.clearAssociations(subset);
                break;
            }
            default: // nothing to clear
        }
    }

    /**
     * Utility returning a copy of the "base" of this instance
     * This utility does not copy the associations with other instances
     *
     * @return a clone of this instance
     */
    public OperationalLimit clone() {
        OperationalLimit newInstance = new OperationalLimit(this);
        OperationalLimit newInstanceSP = newInstance;
        return newInstanceSP;
    }

}


