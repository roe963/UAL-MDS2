import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-productos.js';

class VistaBuscarproductocliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 1; background-color: var(--lumo-contrast-10pct); align-self: stretch; flex-grow: 0;">
  <vaadin-vertical-layout theme="spacing" style="padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); align-self: center; flex-grow: 0;">
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
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-xl); align-self: stretch; flex-grow: 1;">
  <label>Buscar</label>
  <label id="label-resultados">Resultados</label>
  <vista-productos style="flex-grow: 1; flex-shrink: 1; align-self: stretch;"></vista-productos>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-buscarproductocliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarproductocliente.is, VistaBuscarproductocliente);
