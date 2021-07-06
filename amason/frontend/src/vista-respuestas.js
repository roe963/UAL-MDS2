import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-respuesta.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
 <vaadin-vertical-layout style="align-self: stretch; margin: var(--lumo-space-xl); flex-grow: 1;" theme="spacing">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <vaadin-button id="button-responder" style="flex-shrink: 0; align-self: center;">
     Responder 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%; align-items: stretch; align-self: stretch;">
   <vista-respuesta style="align-self: stretch;"></vista-respuesta>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
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
