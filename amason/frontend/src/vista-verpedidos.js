import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-verpedidos`
 *
 * VistaVerpedidos element.
 *
 * @customElement
 * @polymer
 */
class VistaVerpedidos extends PolymerElement {

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
        return 'vista-verpedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerpedidos.is, VistaVerpedidos);
