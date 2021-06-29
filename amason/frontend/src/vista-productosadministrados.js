import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productoadministrado.js';

class VistaProductosadministrados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="layout-productos">
 <vista-productoadministrado style="align-self: stretch; flex-grow: 1;" id="vistaProductoAdministrado"></vista-productoadministrado>
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
