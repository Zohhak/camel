/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The printer component is used for sending messages to printers as print jobs.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PrinterEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Printer component.
     */
    public interface PrinterEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedPrinterEndpointBuilder advanced() {
            return (AdvancedPrinterEndpointBuilder) this;
        }
        /**
         * Number of copies to print.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder copies(int copies) {
            doSetProperty("copies", copies);
            return this;
        }
        /**
         * Number of copies to print.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder copies(String copies) {
            doSetProperty("copies", copies);
            return this;
        }
        /**
         * Sets DocFlavor to use.
         * 
         * The option is a: <code>javax.print.DocFlavor</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder docFlavor(Object docFlavor) {
            doSetProperty("docFlavor", docFlavor);
            return this;
        }
        /**
         * Sets DocFlavor to use.
         * 
         * The option will be converted to a <code>javax.print.DocFlavor</code>
         * type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder docFlavor(String docFlavor) {
            doSetProperty("docFlavor", docFlavor);
            return this;
        }
        /**
         * Sets DocFlavor to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder flavor(String flavor) {
            doSetProperty("flavor", flavor);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets the stationary as defined by enumeration names in the
         * javax.print.attribute.standard.MediaSizeName API. The default setting
         * is to use North American Letter sized stationary. The value's case is
         * ignored, e.g. values of iso_a4 and ISO_A4 may be used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder mediaSize(String mediaSize) {
            doSetProperty("mediaSize", mediaSize);
            return this;
        }
        /**
         * Sets MediaTray supported by the javax.print.DocFlavor API, for
         * example upper,middle etc.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder mediaTray(String mediaTray) {
            doSetProperty("mediaTray", mediaTray);
            return this;
        }
        /**
         * Sets mimeTypes supported by the javax.print.DocFlavor API.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder mimeType(String mimeType) {
            doSetProperty("mimeType", mimeType);
            return this;
        }
        /**
         * Sets the page orientation.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder orientation(String orientation) {
            doSetProperty("orientation", orientation);
            return this;
        }
        /**
         * Sets the prefix name of the printer, it is useful when the printer
         * name does not start with //hostname/printer.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder printerPrefix(String printerPrefix) {
            doSetProperty("printerPrefix", printerPrefix);
            return this;
        }
        /**
         * etting this option to false prevents sending of the print data to the
         * printer.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder sendToPrinter(boolean sendToPrinter) {
            doSetProperty("sendToPrinter", sendToPrinter);
            return this;
        }
        /**
         * etting this option to false prevents sending of the print data to the
         * printer.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder sendToPrinter(String sendToPrinter) {
            doSetProperty("sendToPrinter", sendToPrinter);
            return this;
        }
        /**
         * Sets one sided or two sided printing based on the
         * javax.print.attribute.standard.Sides API.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PrinterEndpointBuilder sides(String sides) {
            doSetProperty("sides", sides);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Printer component.
     */
    public interface AdvancedPrinterEndpointBuilder
            extends
                EndpointProducerBuilder {
        default PrinterEndpointBuilder basic() {
            return (PrinterEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPrinterEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPrinterEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPrinterEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPrinterEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Printer (camel-printer)
     * The printer component is used for sending messages to printers as print
     * jobs.
     * 
     * Category: printing
     * Available as of version: 2.1
     * Maven coordinates: org.apache.camel:camel-printer
     * 
     * Syntax: <code>lpr:hostname:port/printername</code>
     * 
     * Path parameter: hostname (required)
     * Hostname of the printer
     * 
     * Path parameter: port
     * Port number of the printer
     * 
     * Path parameter: printername
     * Name of the printer
     */
    default PrinterEndpointBuilder lpr(String path) {
        class PrinterEndpointBuilderImpl extends AbstractEndpointBuilder implements PrinterEndpointBuilder, AdvancedPrinterEndpointBuilder {
            public PrinterEndpointBuilderImpl(String path) {
                super("lpr", path);
            }
        }
        return new PrinterEndpointBuilderImpl(path);
    }
}