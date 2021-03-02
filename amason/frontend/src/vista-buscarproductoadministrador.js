import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-buscarproductoadministrador`
 *
 * VistaBuscarproductoadministrador element.
 *
 * @customElement
 * @polymer
 */
class VistaBuscarproductoadministrador extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-buscarproductoadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarproductoadministrador.is, VistaBuscarproductoadministrador);
