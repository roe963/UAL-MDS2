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
<h3 style="margin-left: var(--lumo-space-xl);">Administrar Categorías</h3>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-anadirCategoria" style="width: 100%; height: 100%; flex-grow: 1; align-items: stretch; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-m);">
  <h4>Agregar Categoría</h4>
  <vista-agregarcategoria></vista-agregarcategoria>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: stretch; width: 100%; height: 100%; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
  <h4>Categorías Activas/Desactivas</h4>
  <vaadin-horizontal-layout theme="spacing" id="layout-categorias" style="margin-top: var(--lumo-space-xs); width: 100%;">
   <vista-categorias></vista-categorias>
  </vaadin-horizontal-layout>
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
