import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaDatosdecompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: stretch; justify-content: center;">
 <label style="align-self: flex-start;">Dirección</label>
 <vaadin-text-field id="textfield-direccion" style="align-self: stretch;"></vaadin-text-field>
 <label style="align-self: flex-start; flex-grow: 0; flex-shrink: 0; margin-top: var(--lumo-space-s);">Forma de pago</label>
 <vaadin-select value="Item one" id="select-formadepago" style="align-self: stretch;"></vaadin-select>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-datosdecompra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDatosdecompra.is, VistaDatosdecompra);
