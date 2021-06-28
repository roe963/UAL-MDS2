import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productoadministrado.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaProductosadministrados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="layout-Productos">
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-text-field label="Buscar" placeholder="Placeholder" id="textFlield-buscar" style="flex-grow: 1;"></vaadin-text-field>
  <vaadin-button theme="icon" aria-label="Add new" id="button-buscar" style="align-self: flex-end;">
   <iron-icon icon="lumo:search"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <h4>Productos Activos/Desactivos</h4>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vista-productoadministrado style="align-self: stretch; flex-grow: 1;" id="vistaProductoAdministrado"></vista-productoadministrado>
 </vaadin-horizontal-layout>
 <vaadin-button id="button-guardar">
  Guardar
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productosadministrados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosadministrados.is, VistaProductosadministrados);
