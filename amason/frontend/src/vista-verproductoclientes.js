import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVerproductoclientes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-button id="button-comprar">
  Comprar
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verproductoclientes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerproductoclientes.is, VistaVerproductoclientes);
