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
import java.util.ArrayList;
import java.util.List;
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
 * This class "BaseVoltage.java" represents the
 * class BaseVoltage extends IdentifiedObject
 *    + isDC   1..1   boolean 
 *    + TopologicalNode   0..-1   TopologicalNode   (inverseAssociation) 
 *    + VoltageLevel   0..-1   VoltageLevel   (inverseAssociation) 
 *    + nominalVoltage   1..1   float 
 *    + ConductingEquipment   0..-1   ConductingEquipment   (inverseAssociation) 

 */
public class BaseVoltage extends IdentifiedObject {

    private static Logger LOGGER = LoggerFactory.getLogger(BaseVoltage.class);

    /**
     * Attribute "isDC"
     *
     * Comment from profile:
     * If true, this is a direct current base voltage and items assigned to this base voltage are also associated with a direct current capabilities.   False indicates alternating current.
     */
    public boolean isDC;

    /**
     * Attribute "topologicalNode"
     *
     * Comment from profile:
     * The topological nodes at the base voltage.
     */
    public List<TopologicalNode> topologicalNode;

    /**
     * Attribute "voltageLevel"
     *
     * Comment from profile:
     * The VoltageLevels having this BaseVoltage.
     */
    public List<VoltageLevel> voltageLevel;

    /**
     * Attribute "nominalVoltage"
     *
     * Comment from profile:
     * The PowerSystemResource's base voltage.
     */
    public float nominalVoltage;

    /**
     * Attribute "conductingEquipment"
     *
     * Comment from profile:
     * Use association to ConductingEquipment only when there is no VoltageLevel container used.
     */
    public List<ConductingEquipment> conductingEquipment;

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
     * Utility to return the "isDC" value
     *
     * @return the value of the attribute "isDC"
     */
    public boolean isDC() {
        return this.isDC;
    }

    /**
     * Utility to set the "isDC" value
     *
     * @param isDCValue 
     *            value to set
     */
    public void setIsDC(boolean isDCValue) {
        this.isDC = isDCValue;
        this.currentBitset.set(0);
    }

    /**
     * Utility to test if the value of "isDC" has been set
     *
     * @return boolean
     *            if true the attribute "isDC" is already set
     *            if false isn't yet
     */
    public boolean isDCIsSet() {
        return this.currentBitset.get(0);
     }
  /**
   * Utility to return the "topologicalNode" List of 
   * "TopologicalNode" enum
   *
   * @return the list of the attributes "topologicalNode"
   */
    public List<TopologicalNode > getTopologicalNode() {
        return this.topologicalNode;
    }

    /**
     * Utility to add a value within the "topologicalNode" ArrayList of 
     * "TopologicalNode"
     *
     * @param topologicalNodeValue 
     *            value to add within the ArrayList
     * @param setInverse
     *            boolean to specify whether to set the inverse association or not
     * @throws LinkageException
     */
    public void addTopologicalNode(
            TopologicalNode topologicalNodeValue, 
            boolean setInverse) throws LinkageException {
        
        if (topologicalNode == null) {
            topologicalNode = new ArrayList<TopologicalNode>();
        }
        
        this.topologicalNode.add(topologicalNodeValue);
        this.currentBitset.set(1);
       
        if (setInverse) {
            
            if (topologicalNodeValue != null) {
                topologicalNodeValue.setBaseVoltage(this, false);
            }
        }
    }

    /**
     * Utility to test if the value of "topologicalNode" has been set
     *
     * @return boolean
     *            if true the attribute "topologicalNode" is already set
     *            if false it isn't yet
     */
    public boolean topologicalNodeIsSet() {
        return this.currentBitset.get(1);
    }
  /**
   * Utility to return the "voltageLevel" List of 
   * "VoltageLevel" enum
   *
   * @return the list of the attributes "voltageLevel"
   */
    public List<VoltageLevel > getVoltageLevel() {
        return this.voltageLevel;
    }

    /**
     * Utility to add a value within the "voltageLevel" ArrayList of 
     * "VoltageLevel"
     *
     * @param voltageLevelValue 
     *            value to add within the ArrayList
     * @param setInverse
     *            boolean to specify whether to set the inverse association or not
     * @throws LinkageException
     */
    public void addVoltageLevel(
            VoltageLevel voltageLevelValue, 
            boolean setInverse) throws LinkageException {
        
        if (voltageLevel == null) {
            voltageLevel = new ArrayList<VoltageLevel>();
        }
        
        this.voltageLevel.add(voltageLevelValue);
        this.currentBitset.set(2);
       
        if (setInverse) {
            
            if (voltageLevelValue != null) {
                voltageLevelValue.setBaseVoltage(this, false);
            }
        }
    }

    /**
     * Utility to test if the value of "voltageLevel" has been set
     *
     * @return boolean
     *            if true the attribute "voltageLevel" is already set
     *            if false it isn't yet
     */
    public boolean voltageLevelIsSet() {
        return this.currentBitset.get(2);
    }
    
    /**
     * Utility to return the "nominalVoltage" value
     *
     * @return the value of the attribute "nominalVoltage"
     */
    public float getNominalVoltage() {
        return this.nominalVoltage;
    }

    /**
     * Utility to set the "nominalVoltage" value
     *
     * @param nominalVoltageValue 
     *            value to set
     */
    public void setNominalVoltage(float nominalVoltageValue) {
        this.nominalVoltage = nominalVoltageValue;
        this.currentBitset.set(3);
    }

    /**
     * Utility to test if the value of "nominalVoltage" has been set
     *
     * @return boolean
     *            if true the attribute "nominalVoltage" is already set
     *            if false isn't yet
     */
    public boolean nominalVoltageIsSet() {
        return this.currentBitset.get(3);
     }
  /**
   * Utility to return the "conductingEquipment" List of 
   * "ConductingEquipment" enum
   *
   * @return the list of the attributes "conductingEquipment"
   */
    public List<ConductingEquipment > getConductingEquipment() {
        return this.conductingEquipment;
    }

    /**
     * Utility to add a value within the "conductingEquipment" ArrayList of 
     * "ConductingEquipment"
     *
     * @param conductingEquipmentValue 
     *            value to add within the ArrayList
     * @param setInverse
     *            boolean to specify whether to set the inverse association or not
     * @throws LinkageException
     */
    public void addConductingEquipment(
            ConductingEquipment conductingEquipmentValue, 
            boolean setInverse) throws LinkageException {
        
        if (conductingEquipment == null) {
            conductingEquipment = new ArrayList<ConductingEquipment>();
        }
        
        this.conductingEquipment.add(conductingEquipmentValue);
        this.currentBitset.set(4);
       
        if (setInverse) {
            
            if (conductingEquipmentValue != null) {
                conductingEquipmentValue.setBaseVoltage(this, false);
            }
        }
    }

    /**
     * Utility to test if the value of "conductingEquipment" has been set
     *
     * @return boolean
     *            if true the attribute "conductingEquipment" is already set
     *            if false it isn't yet
     */
    public boolean conductingEquipmentIsSet() {
        return this.currentBitset.get(4);
    }


    /**
     * Factory of the class
     *
     * @param id
     *            id of the class BaseVoltage to create
     * @return the class created
     */
    public static BaseVoltage create(final String id) {
        BaseVoltage newBaseVoltage = new BaseVoltage();
        newBaseVoltage.setId(id);
        return newBaseVoltage;
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

        switch (subset) {
            default: // nothing to clear
        }
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

        if (class_name.equals("BaseVoltage")) {
            if (attr_name.equals("isDC")) {

                if (!(model.isCurrentSubsetSet())
                        || (model.getCurrentSubset() == Subset.Equipment)) {
                     boolean typedValue;
                    if (!value.isEmpty()) {
                        typedValue = Boolean
                                .parseBoolean(value);

                        if (!value.equalsIgnoreCase("true")
                                && !value.equalsIgnoreCase("false")) {
                            StringBuilder warnMessage = new StringBuilder(
                                    "The boolean attribute");
                            warnMessage
                                    .append("in class BaseVoltage whose");
                            warnMessage.append(" field is equal to ");
                            warnMessage.append(value);
                            warnMessage
                                    .append("has been interpreted as : false");
                           LOGGER.warn(warnMessage.toString());
                        }

                    } else {
                        throw new InterpretationException("The field of boolean"
                            + " in BaseVoltage was found empty");
                    }



                    this.setIsDC(typedValue);
                    return;
                } else {
                    StringBuilder errorMessage
                            = new StringBuilder("The attribute \"");
                    errorMessage.append(attr_name);
                    errorMessage.append("\" in class \"");
                    errorMessage.append(class_name);
                    errorMessage.append("\" cannot be defined in a file ");
                    errorMessage.append("describing an other subset than ");
                    errorMessage.append("\"Equipment\".");
                    throw new InterpretationException(errorMessage.toString());
                }
            }
            if (attr_name.equals("nominalVoltage")) {

                if (!(model.isCurrentSubsetSet())
                        || (model.getCurrentSubset() == Subset.Equipment)) {
                    float typedValue;
                    if (!value.isEmpty()) {

                        try {
                            if (value.equalsIgnoreCase("NaN")) {
                                throw new NumberFormatException();
                            }
                            typedValue = Float
                                    .parseFloat(value);
                        } catch(NumberFormatException e) {
                            throw new InterpretationException("The attribute nominalVoltage in class "
                                + "BaseVoltage is supposed to be a Float"
                                + " but has not the expected NumberFormat");
                        }

                    } else {
                        throw new InterpretationException("The field of float"
                            + " in BaseVoltage was found empty");
                    }

                    this.setNominalVoltage(typedValue);
                    return;
                } else {
                    StringBuilder errorMessage
                            = new StringBuilder("The attribute \"");
                    errorMessage.append(attr_name);
                    errorMessage.append("\" in class \"");
                    errorMessage.append(class_name);
                    errorMessage.append("\" cannot be defined in a file ");
                    errorMessage.append("describing an other subset than ");
                    errorMessage.append("\"Equipment\".");
                    throw new InterpretationException(errorMessage.toString());
                }
            }
                StringBuilder errorMessage = new StringBuilder("The attribute \"");
                errorMessage.append(attr_name);
                errorMessage.append("\" in class \"");
                errorMessage.append(class_name);
                errorMessage
                        .append("\" could not be found in the model !");
                throw new InterpretationException(errorMessage.toString());
            } else {
                // We do not check if we are in the proper subset
                // to call the function on
                // the parent class
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
        if (class_name.equals("BaseVoltage")) {
            
            StringBuilder errorMessage = new StringBuilder("The association \"");
            errorMessage.append(resource_name);
            errorMessage.append("\" in class \"");
            errorMessage.append(class_name);
            errorMessage.append("\" could not be found in the model !");
            throw new InterpretationException(errorMessage.toString());
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

        if (writeID) {

            try {
                xmlsw.writeStartElement(CIMURI.CIMURI, "BaseVoltage");
                xmlsw.writeAttribute(CIMModel.rdfURI, "ID", getId());
                // xmlsw.writeCharacters("\n");
            } catch (XMLStreamException e) {
                StringBuilder errorMessage = new StringBuilder(
                        "Error while trying to write the class ");
                errorMessage.append("BaseVoltage ");
                errorMessage.append("which ID has been initialized to : ");
                errorMessage.append(getId());
                LOGGER.error(errorMessage.toString());
                LOGGER.error(e.toString(), e);
            }
        }
        writeClass(xmlsw);
        super.write(xmlsw, false);

        if (writeID) {
            try {
                xmlsw.writeEndElement();
                // xmlsw.writeCharacters("\n");
            } catch (XMLStreamException e) {
                StringBuilder errorMessage = new StringBuilder(
                        "Error while trying to write the end Element of the class ");
                errorMessage.append("BaseVoltage ");
                errorMessage.append("which ID has been initialized to : ");
                errorMessage.append(getId());
                LOGGER.error(errorMessage.toString());
                LOGGER.error(e.toString(), e);
            }
        }

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

        switch (subset) {
        case Equipment: {

            if (writeID) {
                try {
                    xmlsw.writeStartElement(CIMURI.CIMURI, "BaseVoltage");
                    xmlsw.writeAttribute(CIMModel.rdfURI, "ID", getId());
                    // xmlsw.writeCharacters("\n");
                } catch (XMLStreamException e) {
                    StringBuilder errorMessage = new StringBuilder(
                            "Error while trying to write the class ");
                    errorMessage.append("BaseVoltage ");
                    errorMessage.append("which ID has been initialized to : ");
                    errorMessage.append(getId());
                    errorMessage.append(" in the subset ");
                    errorMessage.append("Equipment");
                   LOGGER.error(errorMessage.toString());
                   LOGGER.error(e.toString(), e);
                }
            }

            writeClass(xmlsw);
            super.write(xmlsw, subset, false);
            if (writeID) {

                try {
                    xmlsw.writeEndElement();
                    // xmlsw.writeCharacters("\n");
                } catch (XMLStreamException e) {
                    StringBuilder errorMessage = new StringBuilder(
                            "Error while trying to write end element of ");
                    errorMessage.append("BaseVoltage ");
                    errorMessage.append("which ID has been initialized to : ");
                    errorMessage.append(getId());
                    errorMessage.append(" in the subset ");
                    errorMessage.append("Equipment");
                    LOGGER.error(errorMessage.toString());
                    LOGGER.error(e.toString(), e);
                }

            }
            break;
        }
        default: {// Do nothing !
        }
        }
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

        // TODO : implement vectors (not required according to CIM
        // specifications)

        // TODO : implement vectors (not required according to CIM
        // specifications)

        // TODO : implement vectors (not required according to CIM
        // specifications)
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
     * @param otherBaseVoltage
     *            the instance to copy
     */
    public void copyBase(final BaseVoltage otherBaseVoltage) {
        boolean newisDC;
        // assigning primitive type :
        if (otherBaseVoltage.currentBitset.get(0)) {
            newisDC = otherBaseVoltage.isDC();
            this.setIsDC(newisDC);
          }
        float newnominalVoltage;
        // assigning primitive type :
        if (otherBaseVoltage.currentBitset.get(3)) {
            newnominalVoltage = otherBaseVoltage.getNominalVoltage();
            this.setNominalVoltage(newnominalVoltage);
          }
        // Memory allocation has done successfully !
        // Dropping "old" objects...
        // This part may change : we do nothing to allow the user to access
        // object by their id from the global model.

        // TODO : Call the parent copy constructor instead ?
        super.copyBase(otherBaseVoltage);

    }

    /**
     * Utility to return the content of this class into the CIM XML format
     *
     * @param xmlsw
     *            the stream in which are stored the elements to write
     */
    private void writeClass(XMLStreamWriter xmlsw) {

        if (currentBitset.get(0)) {

        try {
            // xmlsw.writeCharacters("\t");
            xmlsw.writeStartElement(CIMURI.CIMURI,
                    "BaseVoltage.isDC");
            xmlsw.writeCharacters(String.valueOf(isDC()));
            xmlsw.writeEndElement();
            // xmlsw.writeCharacters("\n");
        } catch(XMLStreamException e) {
            StringBuilder errorMessage = new StringBuilder(
                    "Error while trying to write the value of the attribute ");
            errorMessage.append("IsDC");
            errorMessage.append(" in class ");
            errorMessage.append("BaseVoltage ");
            errorMessage.append("which ID has been initialized to : ");
            errorMessage.append(getId());
            LOGGER.error(errorMessage.toString());
            LOGGER.error(e.toString(), e);
        }
        }

        if (currentBitset.get(1)) {
      for (TopologicalNode topologicalNode : this.topologicalNode){
               try {
                 xmlsw.writeEmptyElement(CIMURI.CIMURI,"BaseVoltage.TopologicalNode");
                 xmlsw.writeAttribute(CIMModel.rdfURI, "resource", "#"
                           + topologicalNode.getId());
               } catch (XMLStreamException e) {
                 StringBuilder errorMessage = new StringBuilder(
                                    "Error while trying to write the reference to ");
                 errorMessage.append("BaseVoltage ");
                 errorMessage.append("which ID has been initialized to : ");
                 errorMessage.append(getId());
                 errorMessage.append(" in the subset ");
                 errorMessage.append("Equipment");
                 LOGGER.error(errorMessage.toString());
                 LOGGER.error(e.toString(), e);
               }
      }
        }

        if (currentBitset.get(2)) {
      for (VoltageLevel voltageLevel : this.voltageLevel){
               try {
                 xmlsw.writeEmptyElement(CIMURI.CIMURI,"BaseVoltage.VoltageLevel");
                 xmlsw.writeAttribute(CIMModel.rdfURI, "resource", "#"
                           + voltageLevel.getId());
               } catch (XMLStreamException e) {
                 StringBuilder errorMessage = new StringBuilder(
                                    "Error while trying to write the reference to ");
                 errorMessage.append("BaseVoltage ");
                 errorMessage.append("which ID has been initialized to : ");
                 errorMessage.append(getId());
                 errorMessage.append(" in the subset ");
                 errorMessage.append("Equipment");
                 LOGGER.error(errorMessage.toString());
                 LOGGER.error(e.toString(), e);
               }
      }
        }

        if (currentBitset.get(3)) {

        try {
            // xmlsw.writeCharacters("\t");
            xmlsw.writeStartElement(CIMURI.CIMURI,
                    "BaseVoltage.nominalVoltage");
            xmlsw.writeCharacters(String.valueOf(getNominalVoltage()));
            xmlsw.writeEndElement();
            // xmlsw.writeCharacters("\n");
        } catch(XMLStreamException e) {
            StringBuilder errorMessage = new StringBuilder(
                    "Error while trying to write the value of the attribute ");
            errorMessage.append("NominalVoltage");
            errorMessage.append(" in class ");
            errorMessage.append("BaseVoltage ");
            errorMessage.append("which ID has been initialized to : ");
            errorMessage.append(getId());
            LOGGER.error(errorMessage.toString());
            LOGGER.error(e.toString(), e);
        }
        }

        if (currentBitset.get(4)) {
      for (ConductingEquipment conductingEquipment : this.conductingEquipment){
               try {
                 xmlsw.writeEmptyElement(CIMURI.CIMURI,"BaseVoltage.ConductingEquipment");
                 xmlsw.writeAttribute(CIMModel.rdfURI, "resource", "#"
                           + conductingEquipment.getId());
               } catch (XMLStreamException e) {
                 StringBuilder errorMessage = new StringBuilder(
                                    "Error while trying to write the reference to ");
                 errorMessage.append("BaseVoltage ");
                 errorMessage.append("which ID has been initialized to : ");
                 errorMessage.append(getId());
                 errorMessage.append(" in the subset ");
                 errorMessage.append("Equipment");
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
                "Instance of \"BaseVoltage\" of id \"");
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
            message.append("\t\"isDC\" needs to be set\n");
        }

        if (isNotSet.get(1)) {
            message.append("\t\"TopologicalNode\" needs to be set\n");
        }

        if (isNotSet.get(2)) {
            message.append("\t\"VoltageLevel\" needs to be set\n");
        }

        if (isNotSet.get(3)) {
            message.append("\t\"nominalVoltage\" needs to be set\n");
        }

        if (isNotSet.get(4)) {
            message.append("\t\"ConductingEquipment\" needs to be set\n");
        }
        return message.toString();
    }

    /**
     * Copy constructor
     * The associations with other objects are not copied
     *
     * @param BaseVoltage
     *            the reference to the class to copy
     * @return the class constructed
     */
    private BaseVoltage(final BaseVoltage otherBaseVoltage) {
        // TODO : check exception safe
        this.copyBase(otherBaseVoltage);
    }

   /**
    * Constructor of the class BaseVoltage
    */
    protected BaseVoltage() {

        super.subset = Subset.Equipment;
        this.minBitsets.put(Subset.StateVariables, new BitSet(5));
        this.minBitsets.put(Subset.Topology, new BitSet(5));
        BitSet classBitset = new BitSet(5);
        classBitset.set(0);
        classBitset.set(3);
        this.minBitsets.put(Subset.Equipment, classBitset);
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
                if (topologicalNode != null) {
                    topologicalNode.clear();
                }
                this.currentBitset.clear(1);
                super.clearAssociations(subset);
                break;
            }
            case Equipment: {
                if (voltageLevel != null) {
                    voltageLevel.clear();
                }
                this.currentBitset.clear(2);
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
    public BaseVoltage clone() {
        BaseVoltage newInstance = new BaseVoltage(this);
        BaseVoltage newInstanceSP = newInstance;
        return newInstanceSP;
    }

}



