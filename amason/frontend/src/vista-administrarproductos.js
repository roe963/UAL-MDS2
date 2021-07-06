import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-agregarproducto.js';

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
<vaadin-vertical-layout style="width: 100%; align-items: center;">
 <h3 style="margin-left: var(--lumo-space-xl);">Administrar Productos</h3>
</vaadin-vertical-layout>
<vaadin-horizontal-layout class="content" style="width: 100%; padding: var(--lumo-space-s); height: 80%;">
 <vaadin-vertical-layout theme="spacing" id="layout-anadirProducto" style="flex-grow: 1; width: 100%; height: 100%; align-items: stretch; border: 1px solid black; padding: var(--lumo-space-s); margin: var(--lumo-space-s);">
  <vista-agregarproducto></vista-agregarproducto>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-grow: 0; align-items: stretch; padding: var(--lumo-space-s); border: 1px solid black; margin: var(--lumo-space-s); height: 100%;">
  <h4 style="align-self: center;">Productos Activos/Desactivos</h4>
  <vaadin-vertical-layout id="layout-productos" style="flex-grow: 0; flex-shrink: 0; align-self: stretch; align-items: stretch;"></vaadin-vertical-layout>
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
