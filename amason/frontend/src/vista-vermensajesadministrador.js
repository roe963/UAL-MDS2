import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
 <vaadin-vertical-layout style="flex-grow: 1; align-self: stretch; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);">
  <h3 style="align-self: center;">Contacto</h3>
  <vaadin-horizontal-layout style="align-self: stretch;">
   <h4 style="flex-grow: 1;">Bandeja de entrada</h4>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="verticalLayout" style="width: 100%; flex-shrink: 0; align-self: stretch; align-items: stretch;"></vaadin-vertical-layout>
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
