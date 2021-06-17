import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-respuesta.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaRespuestas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
  <h4 id="h-mensaje" style="flex-grow: 1;">Mensaje</h4>
  <vaadin-button id="button-volver" style="align-self: center;">
    Volver 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vista-respuesta style="align-self: stretch;"></vista-respuesta>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-respuestas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRespuestas.is, VistaRespuestas);
