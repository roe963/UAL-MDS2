import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-productosdelcarrito.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-pedidosclienteregistrado.js';

class VistaVeepedidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; padding: var(--lumo-space-xl);">
  <h4>Mis pedidos</h4>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%;">
   <vista-pedidosclienteregistrado></vista-pedidosclienteregistrado>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-veepedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVeepedidos.is, VistaVeepedidos);
