import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaBuscarproductoadministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-text-field placeholder="Search" id="textfield-buscar" style="flex-grow: 1;">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
 <vaadin-button theme="icon" aria-label="Search" id="button-buscar">
  <iron-icon icon="lumo:plus"></iron-icon>
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-buscarproductoadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarproductoadministrador.is, VistaBuscarproductoadministrador);
