import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaAgregarcategoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: stretch;">
 <vaadin-text-field label="Id Categoria" placeholder="Placeholder" id="textField-idCategoria"></vaadin-text-field>
 <vaadin-text-field label="Nombre" id="textField-nombre" style="align-self: stretch;"></vaadin-text-field>
 <vaadin-button id="button-anadir" style="margin-top: var(--lumo-space-xl);">
   Añadir 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-agregarcategoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregarcategoria.is, VistaAgregarcategoria);
