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
 * This class "RegulatingCondEq.java" represents the
 * class RegulatingCondEq extends ConductingEquipment
 *    + RegulatingControl   0..1   RegulatingControl 

 */
public class RegulatingCondEq extends ConductingEquipment {

    private static Logger LOGGER = LoggerFactory.getLogger(RegulatingCondEq.class);

    /**
     * Attribute "regulatingControl"
     *
     * Comment from profile:
     * copy from ...Regulating control scheme in which this equipment participates.
     */
    public RegulatingControl regulatingControl;

    /**
     * The id of the attribute "regulatingControl"
     * This id is mainly used to resolve links after parsing an instance
     */

    public String idRegulatingControl;

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
     * Utility to return the "regulatingControl"
     *
     * @return the value of the attribute "regulatingControl"
     */
    public RegulatingControl getRegulatingControl() {
        return this.regulatingControl;
    }

    /**
     * Utility to test if the value of "regulatingControl" has been set
     *
     * @return boolean
     *            if true the attribute "regulatingControl" is already set
     *            if false it isn't yet
     */
    public boolean regulatingControlIsSet() {
        return this.currentBitset.get(0);
    }

    /**
     * Utility to set the "regulatingControlValue"
     *
     * @param regulatingControlValue
     *            instance to set
     * @param setInverse
     *            boolean to specify whether to set the inverse association
     *            or not
     * @throws LinkageException
     */
    public void setRegulatingControl(
            RegulatingControl regulatingControlValue,
            boolean setInverse) throws LinkageException {
        this.regulatingControl = regulatingControlValue;
        this.currentBitset.set(0);
        if (setInverse) {
            
            if (regulatingControlValue != null) {
                regulatingControlValue.addRegulatingCondEq(this, false);
            }
        }
    }


    /**
     * Factory of the class
     *
     * @param id
     *            id of the class RegulatingCondEq to create
     * @return the class created
     */
    public static RegulatingCondEq create(final String id) {
        RegulatingCondEq newRegulatingCondEq = new RegulatingCondEq();
        newRegulatingCondEq.setId(id);
        return newRegulatingCondEq;
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

        if (class_name.equals("RegulatingCondEq")) {
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
        if (class_name.equals("RegulatingCondEq")) {
        if (resource_name.equals("RegulatingControl")) {
            idRegulatingControl = id.substring(1);

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
        if (idRegulatingControl != null) {
            RegulatingControl attributeToSet =
                    model.searchRegulatingControl
                    (idRegulatingControl);

            if (attributeToSet != null) {
                boolean setInverse = true;

                try {
                    this.setRegulatingControl(attributeToSet, setInverse);
                } catch(LinkageException e) {
                   LOGGER.error(e.toString(), e);
                    throw new LinkageException(e.getMessage());
                }
            } else if (boundaryModel != null) {
                RegulatingControl attributeToSetFromBoundary = boundaryModel.searchRegulatingControl(idRegulatingControl);
                if(attributeToSetFromBoundary != null) {
                    attributeToSetFromBoundary.setFromBoundary(true);
                    try {
                        model.createRegulatingControl(idRegulatingControl, attributeToSetFromBoundary);
                    } catch (InterpretationException e) {
                       LOGGER.error(e.toString(), e);
                    }
                    boolean setInverse = true;
                    try {
                        this.setRegulatingControl(attributeToSetFromBoundary, setInverse);
                    } catch(LinkageException e) {
                       LOGGER.error(e.toString(), e);
                        throw new LinkageException(e.getMessage());
                    }
                    attributeToSetFromBoundary.resolveLinks(model, boundaryModel);
                } else {
                    StringBuilder errorMessage = new StringBuilder(
                            "Could not find the reference to object of type \"RegulatingControl\" and id \"");
                    errorMessage.append(idRegulatingControl);
                    errorMessage.append("\" in \"RegulatingCondEq\" of id \"");
                    errorMessage.append(this.getId());
                    errorMessage.append("\" !");
                    throw new LinkageException(errorMessage.toString());
                }
            } else {
                StringBuilder errorMessage = new StringBuilder(
                        "Could not find the reference to object of type \"RegulatingControl\" and id \"");
                errorMessage.append(idRegulatingControl);
                errorMessage.append("\" in \"RegulatingCondEq\" of id \"");
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
     * @param otherRegulatingCondEq
     *            the instance to copy
     */
    public void copyBase(final RegulatingCondEq otherRegulatingCondEq) {

        // Memory allocation has done successfully !
        // Dropping "old" objects...
        // This part may change : we do nothing to allow the user to access
        // object by their id from the global model.

        if (otherRegulatingCondEq.currentBitset.get(0)) {
            RegulatingControl regulatingControlAssociation = otherRegulatingCondEq.getRegulatingControl();

            //this.idRegulatingControl = (regulatingControlAssociation != null) ? regulatingControlAssociation.getId() : "";
            if (regulatingControlAssociation != null) {
                this.idRegulatingControl = regulatingControlAssociation.getId();
                // the proper bit will be set when the setter is called
            } else {
                this.idRegulatingControl = "";
            }
        }

        // TODO : Call the parent copy constructor instead ?
        super.copyBase(otherRegulatingCondEq);

    }

    /**
     * Utility to return the content of this class into the CIM XML format
     *
     * @param xmlsw
     *            the stream in which are stored the elements to write
     */
    private void writeClass(XMLStreamWriter xmlsw) {

        if (currentBitset.get(0)) {
        if (idRegulatingControl != null) {
            try {
                // xmlsw.writeCharacters("\t");
                xmlsw.writeEmptyElement(CIMURI.CIMURI,
                        "RegulatingCondEq.RegulatingControl");
                xmlsw.writeAttribute(CIMModel.rdfURI, "resource", "#"
                        + idRegulatingControl);
                // xmlsw.writeCharacters("\n");
            } catch(XMLStreamException e) {
                StringBuilder errorMessage = new StringBuilder(
                        "Error while trying to write the resource attribute ");
                errorMessage.append("RegulatingControl");
                errorMessage.append(" in class ");
                errorMessage.append("RegulatingCondEq ");
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
                "Instance of \"RegulatingCondEq\" of id \"");
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
            message.append("\t\"RegulatingControl\" needs to be set\n");
        }
        return message.toString();
    }

    /**
     * Copy constructor
     * The associations with other objects are not copied
     *
     * @param RegulatingCondEq
     *            the reference to the class to copy
     * @return the class constructed
     */
    private RegulatingCondEq(final RegulatingCondEq otherRegulatingCondEq) {
        // TODO : check exception safe
        this.copyBase(otherRegulatingCondEq);
    }

   /**
    * Constructor of the class RegulatingCondEq
    */
    protected RegulatingCondEq() {

         // This class is not "concrete" : it is not supposed to be instanciated directly
         // subset is not set : it will be set by subclass
        // attribute "RegulatingControl" is optional :
        this.minBitset.clear(0);
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
                regulatingControl = null;
                idRegulatingControl = "";
                this.currentBitset.clear(0);
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
    public RegulatingCondEq clone() {
        RegulatingCondEq newInstance = new RegulatingCondEq(this);
        RegulatingCondEq newInstanceSP = newInstance;
        return newInstanceSP;
    }

}



