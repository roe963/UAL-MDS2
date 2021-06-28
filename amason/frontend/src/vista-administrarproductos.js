import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-agregarproducto.js';
import './vista-productosadministrados.js';

class VistaAdministrarproductos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
<h4 style="margin: var(--lumo-space-xl);">Administrar productos</h4>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-anadirProducto" style="flex-grow: 1; width: 100%; height: 100%; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-xl); align-items: stretch;">
  <vista-agregarproducto></vista-agregarproducto>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 1; margin-left: var(--lumo-space-m); margin-right: var(--lumo-space-xl); align-items: stretch;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-text-field label="Buscar" id="textFlield-buscar" style="flex-grow: 1;"></vaadin-text-field>
   <vaadin-button theme="icon" aria-label="Add new" id="button-buscar" style="align-self: flex-end;">
    <iron-icon icon="lumo:search"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <h4>Productos Activos/Desactivos</h4>
  <vaadin-horizontal-layout theme="spacing" id="layout-productos" style="align-items: stretch;">
   <vista-productosadministrados></vista-productosadministrados>
  </vaadin-horizontal-layout>
  <vaadin-button id="button-guardar">
    Guardar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarproductos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarproductos.is, VistaAdministrarproductos);
