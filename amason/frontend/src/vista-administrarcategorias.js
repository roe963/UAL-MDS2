import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-agregarcategoria.js';
import './vista-categorias.js';

class VistaAdministrarcategorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
<vaadin-vertical-layout style="align-items: center; justify-content: center;">
 <h3 style="align-self: center;">Administrar categorías</h3>
</vaadin-vertical-layout>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: space-around;">
 <vaadin-vertical-layout style="width: 100%; height: 80%; flex-grow: 1; align-items: stretch; padding: var(--lumo-space-l); border: 1px solid black; margin: var(--lumo-space-s);">
  <h4 style="align-self: center;">Agregar Categoría</h4>
  <vaadin-vertical-layout theme="spacing" id="layout-anadirCategoria" style="align-items: stretch;">
   <vista-agregarcategoria style="padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s);"></vista-agregarcategoria>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-grow: 1; align-items: stretch; width: 100%; height: 80%; padding: var(--lumo-space-l); border: 1px solid black; margin: var(--lumo-space-s);">
  <h4 style="align-self: center;">Categorías Activas/Desactivas</h4>
  <vaadin-vertical-layout id="layout-categorias" style="align-self: stretch; align-items: stretch;">
   <vista-categorias style="flex-grow: 0; flex-shrink: 0;"></vista-categorias>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarcategorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarcategorias.is, VistaAdministrarcategorias);
