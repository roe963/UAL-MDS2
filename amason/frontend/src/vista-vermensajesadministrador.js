import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-mensajesadministrador.js';

class VistaVermensajesadministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl);">
  <h4>Contacto</h4>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <h4 style="flex-grow: 1;">Bandeja de entrada</h4>
   <vaadin-button id="button-redactar" style="flex-grow: 0; align-self: center;">
     Redactar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vista-mensajesadministrador style="align-self: stretch;"></vista-mensajesadministrador>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vermensajesadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVermensajesadministrador.is, VistaVermensajesadministrador);
