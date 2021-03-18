import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productosdelcarrito.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-pedidosclienteregistrado.js';

class VistaVerpedidos extends PolymerElement {

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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-vertical-layout theme="spacing" style="padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); align-self: center;">
   <h2 style="align-self: center;">Amason</h2>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button id="button-inicio">
     🏠 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1; flex-shrink: 1;">
   <vaadin-text-field style="flex-grow: 0; flex-shrink: 1; align-self: stretch; padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs); padding-left: var(--lumo-space-xl); padding-right: var(--lumo-space-xs);" id="textfield-buscar"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button id="button-buscar">
     🔍 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
   <vaadin-button id="button-carrito">
     🛒 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-m);">
   <vaadin-button id="button-usuario">
     Usuario 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; padding: var(--lumo-space-xl);">
  <h4>Mis pedidos</h4>
  <vista-pedidosclienteregistrado></vista-pedidosclienteregistrado>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verpedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerpedidos.is, VistaVerpedidos);
